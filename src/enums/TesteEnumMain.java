package enums;
public class TesteEnumMain {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		curso.setNome("Analise e desenvolvimento de sistemas");
		curso.setHoras(18000);
		curso.setTurno(Turno.NOITE);
		
		System.out.println("Nome: " + curso.getNome() + "\n" + 
							"Turno: " + curso.getTurno().getDescricao()
				);
	}
}
