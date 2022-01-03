class StudentDetails{
						static String names[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
		     
		   static void printAll(){
		    for(int index=0;index<names.length;index++){
				System.out.println(names[index]);
			}
		   }
			static void updateNames(String oldname,String newname){
				for(int number=0;number<names.length;number++){
					
				if(oldname.equals(names[number])){
					names[number]=newname;
				}
				
				}
				
			}
			 static void addName(int index,String name){
				names[index]=name;
			}
}

