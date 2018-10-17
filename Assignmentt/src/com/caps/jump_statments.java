package com.caps;

   
 class jump_statments 
     {
         public static void main(String args[])
         {        
              int x = 2;
              int y = 0;
              for ( ; y < 10; ++y) 
              {
                  if (y % x == 0) 
                      continue;  
                  else if (y == 8)
                       break;
                  else
                     System.out.print(y +" ");
              }
 
                 
              }
         } 


/*1. class jump_statments 
2.     {
3.         public static void main(String args[]) 
4.         {        
5.              int x = 2;
6.              int y = 0;
7.              for ( ; y < 10; ++y) 
8.              {
9.                  if (y % x == 0) 
10.                      continue;  
11.                  else if (y == 8)
12.                       break;
13.                  else
14.                     System.out.print(y + "" "");
15.              }
16.         } 
17.     }
*/

















