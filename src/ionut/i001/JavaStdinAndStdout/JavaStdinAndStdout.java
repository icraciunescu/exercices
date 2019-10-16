package ionut.i001.JavaStdinAndStdout;

import java.util.Scanner;

public class JavaStdinAndStdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    /*

    https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

    Most	HackerRank	challenges	require	you	to	read	input	from	stdin	(standard	input)	and	write	output	to stdout	(standard	output). One	popular	way	to	read	input	from	stdin	is	by	using	the	Scanner	class	and	specifying	the	I n p u t	S t r e a m	as S y s t e m.in .	For	example:
    Scanner	scanner	=	new	Scanner(System.in); String	myString	=	scanner.next(); int	myInt	=	scanner.nextInt(); scanner.close(); System.out.println("myString	is:	"	+	myString); System.out.println("myInt	is:	"	+	myInt);
    The	code	above	creates	a	S c a n n e r	object	named		and	uses	it	to	read	a	S t rin g	and	an	in t .	It	then clo s e s	the	S c a n n e r	object	because	there	is	no	more	input	to	read,	and	prints	to	stdout	using S y s t e m. o u t. p rin tln ( S t rin g ) .	So,	if	our	input	is:
    Hi	5
    Our	code	will	print:
    myString	is:	Hi myInt	is:	5
    Alternatively,	you	can	use	the	BufferedReader	class. Task	In	this	challenge,	you	must	read		integers	from	stdin	and	then	print	them	to	stdout.	Each	integer	must	be printed	on	a	new	line.	To	make	the	problem	a	little	easier,	a	portion	of	the	code	is	provided	for	you	in	the editor	below. Input	Format There	are		lines	of	input,	and	each	line	contains	a	single	integer. Sample	Input
42 100 125
    Sample	Output
42 100 125
     */

}