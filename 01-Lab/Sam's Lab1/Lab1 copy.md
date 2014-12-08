# Lab 1

Include your writeup for the Lab 1 questions here. Use correct
Markdown markup. For more details, start with the article
https://help.github.com/articles/github-flavored-markdown

Samuel Carnes
CSCI 3155
Answers for written questions

1. (a) The use of pi at line 4 is bound at line 3, being defined in this context.
       The use of pi at line 7 is bound at line 1.
	   
   (b) The use of x at line 3 is bound at line 2, being bound to each call of f.
       The use of x at line 6 is bound at line 2 for the same reason.
	   The use of x at line 10 is bound at line 2 as it occurs outside of the most recent context involving the latest definition of x at line 8.
	   The use of x at line 13 is bound at line 1, being in the outermost context.
   
2. Yes, the body expression of g is well-typed with type Tuple2
		((x,3), 1):Tuple2 because
			(x,3):Tuple2 because
				x:Int
				3:Int
			1:Int
		((x,3), 1 + 2):Tuple2 because
			(x,3):Tuple2 because
				x:Int
				3:Int
			1 + 2:Int because
				1:Int
				2:Int