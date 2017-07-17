class daysOfMonth
{
	public static void main(String[] arr)
	{
		String[] month = new String[]{"Jan", "Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};

		int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

		System.out.println("Enter month to find its days");
		String m = System.console().readLine();

			if (m.equals(month[0]) || m.equals("jan"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[0]);
			}
			if (m.equals(month[1]) || m.equals("feb"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[1]);
			}
			if (m.equals(month[2]) || m.equals("mar"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[2]);
			}
			if (m.equals(month[3]) || m.equals("april"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[3]);
			}
			if (m.equals(month[4]) || m.equals("may"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[4]);
			}
			if (m.equals(month[5]) || m.equals("june"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[5]);
			}
			if (m.equals(month[6]) || m.equals("july"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[6]);
			}
			if (m.equals(month[7]) || m.equals("aug"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[7]);
			}
			if (m.equals(month[8]) || m.equals("sep"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[8]);
			}
			if (m.equals(month[9]) || m.equals("oct"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[9]);
			}
			if (m.equals(month[10]) || m.equals("nov"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[10]);
			}
			if (m.equals(month[11]) || m.equals("dec"))
			{
				
					System.out.println("No. of days in "+ m +" is "+ days[11]);
			}
			
				else{
					System.out.println("wrong entry");
				}
		


	}
}