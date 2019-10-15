#!/bin/bash

# example: ./run-docker.sh -p yes -a 3000 -d 3306 -t 9966 -n petclinic-angular2

usage() {
  echo "Run docker container with petclinic application"
  echo "Valid options:"
  echo " -h, prints this message."
  echo " -a PORT [3000], assigns application server binding port to localhost. Must be a number!!"
  echo " -d PORT [3306], assigns database binding port to localhost. Must be a number!!"
  echo " -t PORT [9966], assings tomcat binding port to localhost. Must be a number!!"
  echo " -p yes|no [no], run docker for production or not"
  echo " -n STRING [default], assigns a name to the running container (mandatory for production usage)"
}

PORT_APP=3000
PORT_DB=3306
PORT_TOMCAT=9966
PRODUCTION=no
CONTAINER_NAME=default

while getopts 'ha:d:t:p:n:' arg
    do
        case ${arg} in
	    h)
		usage
		exit 0
		;;
            a)
		PORT_APP=${OPTARG};;
            d)
		PORT_DB=${OPTARG};;
            t)
		PORT_TOMCAT=${OPTARG};;
	    p)
		PRODUCTION=${OPTARG};;
	    n)
		CONTAINER_NAME=${OPTARG};;
	    \?)
		echo "Invalid option: -$OPTARG. See usage below."
		usage
		exit 1
		;;
	    :)
		echo "Option -$OPTARG requires an argument." >&2
		exit 1
		;;
        esac
done

echo Port app: $PORT_APP
echo Port db: $PORT_DB
echo Port tomcat: $PORT_TOMCAT
echo Production: $PRODUCTION
echo Container name: $CONTAINER_NAME
CONTAINER_NAME_CLIENT=$CONTAINER_NAME-client
CONTAINER_NAME_SERVER=$CONTAINER_NAME-server

if [[ $PRODUCTION == "yes"  ]]; then
	if [[ $CONTAINER_NAME == "default" ]]; then
		echo "Assigns a name to the running container for production usage!!"
		exit 1
	fi
	docker run -it --workdir=/home/spring-petclinic-angular2 --name=$CONTAINER_NAME_SERVER \
		--expose 9996 --expose 3306 -p $PORT_DB:3306 -p $PORT_TOMCAT:9966 -d \
		--env PATH=/root/.npm-global/bin:/root/workspace/maven/apache-maven-3.5.4/bin:/root/workspace/java/jdk1.8.0_201/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin \
		--env CLIENT_OR_SERVER=server \
		--entrypoint ./run-services-docker.sh dockercontainervm/petclinic-angular2:empty-db bash
	sleep 15
	docker run -it --workdir=/home/spring-petclinic-angular2 --name=$CONTAINER_NAME_CLIENT \
		--expose 4200 -p $PORT_APP:4200 -d \
		--env PATH=/root/.npm-global/bin:/root/workspace/maven/apache-maven-3.5.4/bin:/root/workspace/java/jdk1.8.0_201/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin \
		--env CLIENT_OR_SERVER=client \
		--entrypoint ./run-services-docker.sh dockercontainervm/petclinic-angular2:empty-db bash
	
else
	docker run -it --workdir=/home/spring-petclinic-angular2 --name=$CONTAINER_NAME_SERVER \
		--expose 9996 --expose 3306 -p $PORT_DB:3306 -p $PORT_TOMCAT:9966 -d \
		--env PATH=/root/.npm-global/bin:/root/workspace/maven/apache-maven-3.5.4/bin:/root/workspace/java/jdk1.8.0_201/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin \
		--env CLIENT_OR_SERVER=server \
		--entrypoint ./run-services-docker.sh dockercontainervm/petclinic-angular2:empty-db bash
	sleep 15
	docker run -it --workdir=/home/spring-petclinic-angular2 --name=$CONTAINER_NAME_CLIENT --env CLIENT_OR_SERVER=client --expose 4200 -p $PORT_APP:4200 dockercontainervm/petclinic-angular2:empty-db bash
	
fi


