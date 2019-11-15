
 class Va {
	 public static  int add(int b,int...a)
	 {
		 int sum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
			 
		 }
		return sum;
		 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10,20,30,40));
	 

	}

}
