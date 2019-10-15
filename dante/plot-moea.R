#!/usr/bin/env Rscript

args <- commandArgs(TRUE)
tsv_file_path <- args[1]

dep <- read.table(file = tsv_file_path, sep = " ")
x <- dep[,1]
y <- dep[,2]

pos <- gregexpr('/',tsv_file_path)
indexLastSlash <- pos[[1]][length(pos[[1]])]

pdf_file_path <- paste(substring(tsv_file_path, 0, indexLastSlash - 1), "plot.pdf", sep = "/")

# Open a pdf file
pdf(pdf_file_path) 
# 2. Create a plot
plot(x, y)
# Close the pdf file
dev.off() 
