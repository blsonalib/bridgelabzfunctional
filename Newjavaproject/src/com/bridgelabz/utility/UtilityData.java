package com.bridgelabz.utility;

import java.util.Scanner;
import java.util.Stack;

public class UtilityData 
{
	public class Utility {
		public static Scanner scanner=new Scanner(System.in);
		
			public static int getInteger()
			{
				return  scanner.nextInt();
		}
			
	
			public static boolean isBalanced(String expression) 
			{
			      Stack<Character> stack = new Stack<Character>();
			      if(expression == null || expression.length() == 0)
			      {
			           return false;
			      } 
			      else 
			      {    
			        for(int i = 0; i < expression.length(); i++){
			 
			          if (expression.charAt(i) == '(' || expression.charAt(i) == '(' ) 
			          {
			        		stack.push(expression.charAt(i));
			          } 
			          else if(expression.charAt(i) == ')')
			          {
				      if(!stack.isEmpty() && stack.peek() == '(')
				      {
				            stack.pop();
				        }
				      else
				        {
				            return false;
				       }
			          } 
			          else if (expression.charAt(i) == ')') 
			          {
			               if(!stack.isEmpty() && stack.peek() == '(') 
			               {
			                  stack.pop();
			              } 
			               else 
			              {
			                  return false;
			              }
			          } 
			          else if(expression.charAt(i) == ')')
			          {
			              if(!stack.isEmpty() && stack.peek() == '(') 
			              {
			                  stack.pop();
			              }
			              else 
			              {
			                  return false;
			              }
			          }
			        }
			 
			        // if stack is empty finally , it means symbol is balance in expression
			        if(stack.isEmpty()) 
			        {
			            return true;
			        } 
			        else
			        {
			            return false;
			        }
	
			      }}}}
		
			
