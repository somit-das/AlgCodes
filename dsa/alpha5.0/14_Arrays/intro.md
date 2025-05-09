# Arrays

## Creating Array

```java
dataType arrayName[] = new dataType[size]
int marks[] = new int[50];
int numbers[] = {1,2,3};
String fruits[] =  {4,5,6}

int marks = new int[50] //( does not work as  Error: incompatible types: int[] cannot be converted to int |  int marks = new int[50];)
```

## Input/Output

```java
int marks[] = new int[100];
Scanner sc = new Scanner(System.in);
marks[0] = sc.nextInt()
<!-- using for loop to take input from user like above example  -->
```

## passing as argument paassing as a reference in Java