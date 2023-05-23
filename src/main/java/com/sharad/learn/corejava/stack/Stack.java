package com.sharad.learn.corejava.stack;

public class Stack {
	private int size;
	private int top=-1;
	private int S[];
	
	//constructor
	public Stack(int sz) {
		
		size=sz;
		S=new int[sz];
	}
	public void push(int x)throws StackOverflowException{
		if(top==size-1) {
			throw new StackOverflowException();
			
			
		}
		top++;
		S[top]=x;
	
	}
	public int pop()throws StackUnderflowException{
		int x=-1;
		if(top==-1) {
			throw new StackUnderflowException();
		}
		x=S[top];
		top--;
		
		return x;
		
	}
	

}
