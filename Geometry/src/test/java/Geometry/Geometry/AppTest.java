package Geometry.Geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import dto.Geometria;

class AppTest {
	
	@Test 	
	public void testConstructorGeometria() {
		Geometria geo = new Geometria();
		
		int rId= geo.getId();
		int esperadoId = 9;		
		String rNombre = geo.getNom();
		String esperadoNombre = "Default";	
		
		assertEquals(esperadoId,rId);
		assertEquals(esperadoNombre,rNombre);
	}
	
	@Test 	
	public void testConstructor2Geometria() {
		Geometria geo = new Geometria(2);
		
		int rId= geo.getId();
		String rNombre = geo.getNom();
		String esperadoNombre = "Circulo";	
		
		assertEquals(2,rId);
		assertEquals(esperadoNombre,rNombre);
	}
	
	@Test
	public void testareacuadrado() {
		int r = Geometria.areacuadrado(6);
		int esperado = 36 ;
		assertEquals(esperado, r);	

	}
	
	@Test
	public void testareaCirculo() {
		double r = Geometria.areaCirculo(2);
		double esperado = 12.5664 ;
		assertEquals(esperado, r);	

	}

	@Test
	public void testAreaTriangulo() {
		
		int r = Geometria.areatriangulo(2, 4);
		int esperado = 4 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaRectangulo() {
		
		int r = Geometria.arearectangulo(2, 2);
		int esperado = 4 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaPentagono() {
		
		int r = Geometria.areapentagono(2, 2);
		int esperado = 2 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaRombo() {
		
		int r = Geometria.arearombo(2, 3);
		int esperado = 3 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaRomboide() {		
		int r = Geometria.arearomboide(4, 5);
		int esperado = 20 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaTrapecio() {
		int resultado = Geometria.areatrapecio(2, 2, 4);
		int esperado = 8;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFigura() {
		String resultado = Geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetId() {
		Geometria geo = new Geometria();
		int resultado = geo.getId();
		int esperado = 9;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetNom() {
		Geometria geo = new Geometria();
		String resultado = geo.getNom();
		String esperado = "Default";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testGetArea() {
		Geometria geo = new Geometria();
		double resultado = geo.getArea();
		double esperado = 0.0;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSetId() {
		Geometria geo = new Geometria();
		geo.setId(1);
		int resultado = geo.getId();
		int esperado = 1;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSetNom() {
		Geometria geo = new Geometria();
		geo.setNom("A");
		String resultado = geo.getNom();
		String esperado = "A";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testSetArea() {
		Geometria geo = new Geometria();
		geo.setArea(4.5);
		double resultado = geo.getArea();
		double esperado = 4.5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testToString() {
		Geometria geo = new Geometria();
		String resultado = geo.toString();
		String esperado = "Geometria [id=9, nom=Default, area=0.0]";
		assertEquals(esperado, resultado);
	}
	
}
