/*class arrays{
	public static void main(String[] args) {
		
		int Students[]= new int[300];
		Students[0]=145;
		Students[1]=30;
		Students[60]=50;
		System.out.println("the array is "+Students[0]);
		System.out.println("the array is "+Students[60]);
	}
}
class arrays{
	public static void main(String[] args) {
		
		int Students[]={2,4,5,6,7,8,9};
		if(Students[3]< 0){
			System.out.println("the answer is "+Students[3]);
		}
		else{
			System.out.println("this is the answer");
		}
}
}
*/
class arrays{
	public static void main(String[] args) {
		System.out.println("Index\tValues");
		int students[]={2,3,4,3,5,6,8,7};
		int counter;
		for(counter=0; counter<students.length; counter++){
			System.out.println(counter+"\t"+students[counter]);
		}
		
	}
}