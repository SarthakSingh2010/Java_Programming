/*Enhanced for loop java: Enhanced for loop is useful when scanning the array instead of using for loop. Syntax of enhanced for loop is:
for (data_type variable: array_name)
Here array_name is the name of array.*/
class EnhancedForLoop {
public static void main(String[] args) {
int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
for (int t: primes) {
System.out.println(t);
}
}
}