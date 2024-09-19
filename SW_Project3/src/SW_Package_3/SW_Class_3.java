package SW_Package_3;

public class SW_Class_3
{ public int sum(int a, int b) // method to SUM
	{int sumtotal = (a+b);
	return sumtotal;
	}

  public int mult(int c, int d) // Method to multiply
    {int multtotal=(c*d);
     return multtotal;
    }	
	
  public int sub(int e, int f) // Method to subtract
  {int subtotal=(e-f);
   return subtotal;
  }	

  public void div(int g, int h) // Method to divide
  {int divtotal=(g/h);
  System.out.println("Answer" + divtotal);}	

public static void main(String[] args)
 { SW_Class_3 ob=new SW_Class_3(); //create object 
int sumresult = ob.sum(10,2); // call methods
int multresult1 = ob.mult(sumresult, 2);
int subresult = ob.sub(multresult1, 2);
int multresult2 = ob.mult(subresult, 2);
ob.div(multresult2, 2);}
}