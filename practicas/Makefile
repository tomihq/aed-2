pdf:
	pdflatex tp.tex

ignorando-errores:
	pdflatex -interaction=nonstopmode tp.tex

bibliografia:
	pdflatex tp.tex
	bibtex tp.aux
	pdflatex tp.tex
	pdflatex tp.tex

clean:
	- rm -f *.log *.soc *.toc *.aux *.out  main.idx *.bbl *.bbg *.dvi *.blg *.lof *.nav *.snm *~

