package EjemploCajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class EjemploCajaNegraTest {

	EjemploCajaNegra MyFunction = new EjemploCajaNegra();
	@Test
	void CP1() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n18\n3000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Los números introducidos no son amigos")>0);
	}
	@Test
	void CP2() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n18\n4000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Los números introducidos no son amigos")>0);
	}
	@Test
	void CP3() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n18\n3000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Los divisores del primer numero son: 2,3,6,9,")>0);
		assertTrue(outContent.toString().indexOf("Los divisores del segundo numero son: 2,3,4,5,6,8,10,12,15,20,24,25,30,40,50,60,75,100,120,125,150,200,250,300,375,500,600,750,1000,1500,")>0);
	}
	@Test
	void CP4() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n18\n4000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Los divisores del primer numero son: 2,3,6,9,")>0);
		assertTrue(outContent.toString().indexOf("Los divisores del segundo numero son: 2,4,5,8,10,16,20,25,32,40,50,80,100,125,160,200,250,400,500,800,1000,2000,")>0);
	}
	@Test
	void CP5() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("Paula\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Lo siento, no se ha indicado la operacion adecuada. Cerramos el programa")>0);
	}
	@Test
	void CP6() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n-15\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El primer numero no es par y positivo. Cerramos el programa")>0);
	}
	@Test
	void CP7() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\nHola\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Ha insertado letras en la indicación del primer número. Cerramos el programa")>0);
	}
	@Test
	void CP8() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n-15\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El primer numero no es par y positivo. Cerramos el programa")>0);
	}
	@Test
	void CP9() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\nHola\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Ha insertado letras en la indicación del primer número. Cerramos el programa")>0);
	}
	@Test
	void CP10() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n18\n2000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El segundo número no está entre 3000 y 5000. Cerramos el programa")>0);
	}
	@Test
	void CP11() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n18\n5000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El segundo número no está entre 3000 y 5000. Cerramos el programa")>0);
	}
	@Test
	void CP12() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n18\n6000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El segundo número no está entre 3000 y 5000. Cerramos el programa")>0);
	}
	@Test
	void CP13() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n18\nAdios\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Ha insertado letras en la indicación del segundo número. Cerramos el programa")>0);
	}
	@Test
	void CP14() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n18\n2000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El segundo número no está entre 3000 y 5000. Cerramos el programa")>0);
	}
	@Test
	void CP15() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n18\n5000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El segundo número no está entre 3000 y 5000. Cerramos el programa")>0);
	}
	@Test
	void CP16() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n18\n6000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("El segundo número no está entre 3000 y 5000. Cerramos el programa")>0);
	}
	@Test
	void CP17() {
		InputStream sysInBackup = System.in; 
		PrintStream sysOutBackup = System.out;
		ByteArrayInputStream in = new ByteArrayInputStream("divisores\n18\nAdios\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		MyFunction.AmigosDivisores();
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Ha insertado letras en la indicación del segundo número. Cerramos el programa")>0);
	}

}
