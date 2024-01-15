# Data Structures and Algorithms Repository

## Introduction

Welcome to my Data Structures and Algorithms Repository. This repository is a comprehensive collection of various data structures and algorithms, implemented in Java. The aim is to provide a thorough understanding of these fundamental computer science concepts with clear and efficient code examples.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Data Structures](#data-structures)
  

## Installation

just clone it or download the zip folder and extract then open eclipse or any other ide and open the extracted folder

## Data Structures

This repository includes the following data structures:

Arrays - Fundamental data structure used to store collections of elements.
Stacks - Collection of elements that follows the Last In First Out (LIFO) principle.
Queues - Collection of elements that follows the First In First Out (FIFO) principle.
LinkedLists - A linear collection of data elements where each element points to the next.
Doubly LinkedLists - Similar to LinkedLists, but with nodes that also reference the previous element.
Trees - A hierarchical structure consisting of nodes with a parent-child relationship

## Usage

you can import each data structure in any class and create an instance of this class

# Example usage if using class in the same package


```
public class example {

public static boolean validate(String s) {

        ArrayStack stack = new ArrayStack (s.length());
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = (char) stack.pop();
                if(c == '}' && top != '{') {
                    return false;
                } else if(c == ')' && top != '(') {
                    return false;
                } else if(c == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String s = "{}[]{";
        System.out.println(validate(s));
            }
        }
    }
```


#if you want to use the class but in another package simply 
import packageName.Arraystack

