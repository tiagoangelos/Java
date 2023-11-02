package heranca;

public class Heranca {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();
        Funcionario funcionario1 = new Funcionario();
        
        pessoa1.setNome("Tiago");
        pessoa1.setIdade(20);
        pessoa1.setSexo("M");
        
        aluno1.setNome("Ana");
        aluno1.setIdade(21);
        aluno1.setSexo("F");
        aluno1.setCurso("Programadora");
        aluno1.setMatricula(132);
        
        professor1.setNome("Paulo");
        professor1.setIdade(42);
        professor1.setSexo("M");
        professor1.setEspecialidade("Graduação");
        professor1.setSalario(3400f);
        professor1.receberAumento(2500f);
        
        funcionario1.setNome("Bob");
        funcionario1.setIdade(52);
        funcionario1.setSexo("M");
        funcionario1.setSetor("FBI");
        funcionario1.setTrabalhando(true);
        
        //Classe Mãe Herdada Por Aluno, Professor, Funcionario
        System.out.println(pessoa1.toString());
        
        //Aluno
        System.out.println("---------------------");
        System.out.println("Aluno (1)");
        System.out.println("---------------------");
        System.out.println(aluno1.toString());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Matricula: " + aluno1.getMatricula());
        
        //professor
        System.out.println("---------------------");
        System.out.println("Professor (1)");
        System.out.println("---------------------");
        System.out.println(professor1.toString());
        System.out.println("Especialidade: " + professor1.getEspecialidade());
        System.out.println("Salario: " + professor1.getSalario());
        
        //funcionario
        System.out.println("---------------------");
        System.out.println("Funcionario (1)");
        System.out.println("---------------------");
        System.out.println(funcionario1.toString());
        System.out.println("Setor: " + funcionario1.getSetor());
        System.out.println("Trabalhando " + funcionario1.getTrabalhando());
    }
    
}