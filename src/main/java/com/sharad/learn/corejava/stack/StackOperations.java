package com.sharad.learn.corejava.stack;

public class StackOperations {
	public static void main(String[]args) {
		Stack st=new Stack(5);
		try {
			st.push(10);
			st.push(9);
			st.push(8);
			st.push(17);
			st.push(18);
			st.push(15);
			
		}
		catch(StackOverflowException s) {
			s.printStackTrace();
			
		}
		Stack st1=new Stack(5);
		try {
			st1.pop();
		}
		catch(StackUnderflowException s) {
			s.printStackTrace();
		}
		
	}

}
