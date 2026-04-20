import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("decrição curso java");
        curso1.setCargaHoraria(15);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("decrição curso JS");
        curso1.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("bootcamp java developer");
        bootcamp1.setDescricao("descricao bootcamp java");

        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos inscritos camila: " + devCamila.getConteudoInscrito());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos camila: " + devCamila.getConteudoInscrito());
        System.out.println("conteudos concluidos camila: " + devCamila.getConteudosConluidos());

        System.out.println("-------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("conteudos inscritos joao: " + devJoao.getConteudoInscrito());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("conteudos inscritos joao: " + devJoao.getConteudoInscrito());
        System.out.println("conteudos concluidos joao: " + devJoao.getConteudosConluidos());





    }
}
