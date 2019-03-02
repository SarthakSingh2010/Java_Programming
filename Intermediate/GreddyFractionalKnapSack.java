import java.util.Scanner;
public class GreddyFractionalKnapSack 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weight of knapsack");
		int bag=sc.nextInt();
		System.out.println("enter number of items");
		int n=sc.nextInt();
		double weight[]=new double[n];
		double value[]=new double [n];
		System.out.println("enter weights");
		for(int i=0;i<n;i++)
		weight[i]=sc.nextInt();
		System.out.println("enter values");
		for(int i=0;i<n;i++)
			value[i]=sc.nextInt();
		
		double valbyweight[]=new double[n];
		for(int i=0;i<n;i++)
			valbyweight[i]=(value[i]/weight[i]);
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(valbyweight[i]<valbyweight[j])
				{
					double t1=valbyweight[i];
					valbyweight[i]=valbyweight[j];
					valbyweight[j]=t1;
					
					double t2=value[i];
					value[i]=value[j];
					value[j]=t2;
					
					double t3=weight[i];
					weight[i]=weight[j];
					weight[j]=t3;
				}
			}
		}
		
		double presentweight=0.0,presentvalue=0.0;
		for(int i=0;i<n;i++)
		{
			if((presentweight+weight[i])<=bag)
				{
					presentweight+=weight[i];
					presentvalue+=value[i];
				}
			else if(presentweight<bag)
			{
				presentvalue+=((bag-presentweight)/weight[i])*value[i];
				presentweight+=(bag-presentweight);
			}
		}
		
		System.out.println("Present Weight :: "+presentweight);
		System.out.println("Present Value  :: "+presentvalue);
		
		sc.close();
	}
}
