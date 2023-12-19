package com.epam.mjc;

public class StudentNonFoundException extends IllegalArgumentException{
  StudentNonFoundException(String message){
       super(message);
   }

}
