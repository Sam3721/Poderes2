package co.edu.udistrital.model;

public class Saiyajin implements SuperFuerza, Volar, Teletransportacion {

	public String gestoActivacion() {
		return "El saiyajin pone sus dedos corazon e indice en su frente para teletransportarse";
	}

	public String aparecer() {
		return "Con un sonido (parecido a un fiush) el saiyajin en menos de un segundo en " +
				"la ubicacion fijada";
	}

	public String desaparecer() {
		return "En un abrir y cerrar de ojos el saiyajin desaparece, " +
				"¿donde podrá haber ido?";
	}

	public String fijarObjetivo() {
		return "El saiyajin solo con sentir una presencia o el ki de alguien puede " +
				"translocalizarse cerca de él/ella";
	}

	public String despegar() {
		return "Al dejarse llevar y sentir el ki fluyendo por su cuerpo," +
				"el saiyajin alza vuelo";
	}

	public String aterrizar() {
		return "Al llegar a su destino el saiyajin desacelera y cae en la superficie cual meteorito";
	}

	public String acelerar() {
		return "Si se siente en la necesidad, el saiyajin puede gastar más de su ki para " +
			"poder volar más rápido";
	}

	public String mantenerse() {
		return "Al estar en equilibrio y sin distracciones, se mantiene en vuelo hasta " +
				"que su ki no de para más";
	}

	public String movimientoRopa() {
		return "Esta varía depende de la velocidad del saiyajin";
	}

	public String golpearFuerte() {
		return "Depende de qué fase esté el saiyajin el golpe será más o menos fuerte";
	}

	public String lanzar() {
		return "El saiyajin crea bolas de energía que estallan y explotan al oponente";
	}

	public String empujar(int distancia) {
		return "Al recubrir su mano de ki, el saiyajin puede empujar las cosas a distancias ridículas"+
				"se dice que a distancias de "+distancia+" metros";
	}

	public String levantarCosasPesadas(int peso) {
		return "Al entrenar en la máquina de gravedad el saiyajin levanta cosas de hasta "+peso
		+" toneladas";
	}

	public String saltarAlto(int distancia) {
		return "A modo de juego o cuando se emociona, el saiyajin salta hasta "+distancia+
		" metros de alto";
	}

}
