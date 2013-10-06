println"Pi"
println"give me a number to add bits of pi"
String str = System.console().readLine()
int numLoops = Integer.parseInt(str)
int current=0, twoCases, tenCases
double total=0, ten = 3.141592653
while(current<numLoops)
{
	
	double top = 1, bottom
	
	//makes sure there is a negative/pos every other term
	if((current+2)%2==0){top=  top}
	else{top = -top}
	
	bottom = current*2+1
	total = total +4*(top/bottom)
	current++
	//println top + " / " + bottom
	
	if(total>3.14&&total<3.15&&twoCases<1)
	{
		println total + "first 3.14 at " + (current-1)
		twoCases++
	}
	
	if(total>ten && total<3.141592654 && tenCases<1)
	{
		println total + "first 3.1415926535 at " + (current-1)
		tenCases++
	}

}
println total

