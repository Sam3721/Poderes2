package co.edu.udistrital.model;

public class Mutante implements Telequinesis, SuperFuerza, SuperVelocidad{

	public String gestoPreparacion() {
		return "Pone sus manos en el suelo y flexiona las rodillas para empezar a correr";
	}

	public String desfase() {
		return "Vibra las particulas de su cuerpo para volverse intangible y atravesar cosas";
	}

	public String correrPorDistintasSuperficies() {
		return "Al correr tan rapido el mutante se desplaza por donde sea gracias a que " +
				"el movimiento de sus piernas evita algun tipo de friccion o impedimento";
	}

	public String ralentizarTiempo() {
		return "Toma un gran respiro y de repente el mundo desacelera, " +
				"haciendo asi un movimiento mas sencillo";
	}

	public String reflejosAumentados() {
		return "La perspectiva alterada de la realidad del mutante le permite predecir algunos " +
				"movimientos y por ende tiene mejores reflejos";
	}

	public String golpearFuerte() {
		return "Mientras mas se enoje el mutante mas fuerte llega a golpear al enemigo";
	}

	public String lanzar() {
		return "Arranca el objeto a lanzar y lo tira a gran velocidad";
	}

	public String empujar(int distancia) {
		return "Con un leve toque el mutante logra severo empujon de hasta "+distancia+" kilometros";
	}

	public String levantarCosasPesadas(int peso) {
		return "Casi sin esfuerzo el mutante puede levantar objetos de hasta "+peso+" toneladas";
	}

	public String saltarAlto(int distancia) {
		return "El mutante se agacha y como no puede volar aprovecha a saltar distancias de "+distancia+
		"metros";
	}

	public String gestoDeActivacion() {
		return "El mutante cierra los ojos y pone un dedo en su cabeza para concentrarse";
	}

	public String moverCosasConLaMente() {
		return "Gracias a su fortaleza mental mueve las cosas facilmente y con una mano" +
				"decide donde dirigir/dejar los objetos";
	}

	public String explotarCosas() {
		return "Si el mutante se estresa o se enoja puede crear una explosion involuntaria " +
				"que es bastante peligrosa"+"No lo hagan enojar.";
	}

	public String leerMentes() {
		return "Con ver al objetivo y enfocarse el mutante accede a la mente y a los pensamientos " +
				"de la persona";
	}

	public String controlarPersonas() {
		return "Similar a como lee mentes, el mutante con tan solo chasquear los dedos " +
				"somete al objetivo a su voluntad y queda a su mandato";
	}

}
