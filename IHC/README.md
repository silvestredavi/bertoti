# Interação Humano Computador
<p align="center">Davi Elias Silvestre - RA:1460482121017	</p>

<h1 align="center">Repositório para atividades de Interação Humano Computador</h1>

<br id="topo">

<p align="center">
  <a href="#ap">Apresentação</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#requisitos">Requisitos</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#desenvolvimento">Desenvolvimento</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#dev">Dev</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
</p>

<div id="#ap">

## ☕Apresentação

<p align="justify">A criação de uma aplicação web envolve uma série de etapas e requisitos a serem cumpridos, dentre estes requisitos, existem as Diretrizes de Acessibilidade de Conteúdo Web, ou WCAG, onde são definidos diversos aspectos que devem ser desenvolvidos quando se está pensando e executando um projeto que contará com conteúdo Web.<br>
<br>Para visualizar este processo, seguirá abaixo alguns exemplos de heurísticas que são postas em prática e outras que deveriam mas não houve atenção suficiente dos criadores: </p>

</div>

<div id="#requisitos">
  
  ## 📝Requisitos

  <p align="justify">Requisito é formalmente definido pelo dicionário como uma condição ou uma exigência que deve ser atendida para alcançar determinado fim. Dentro da engenharia de software, os requisitos são imprescindíveis ao longo de todo o ciclo de vida de um software, independentemente de sua natureza (marketplace, aplicativo, página web etc.).<br>
<br>Esses requisitos são divididos em duas categorias: requisitos funcionais e requisitos não funcionais.<br><br>
    <b> A) Requisitos funcionais: </b>
    <br>
    <br> Dizem respeito ao comportamento do software, ou seja, todas as funções e informações a serem executadas, fornecidas e tratadas por ele. Mais especificamente, guarda relação com a forma como ele deve reagir a determinadas entradas, a como ele irá se portar em determinadas situações, e até mesmo a declarar o que o sistema não deve fazer.<br>
<br>No exemplo da plataforma de ensino, ela deve ser capaz de separar os usuários em dois perfis: de professor e de aluno. O perfil do professor precisa estar apto a criar equipes, a entrar em contato com outros professores e/ou alunos, a criar reuniões, entre outras atividades. Já o perfil do aluno deve permitir a ele criar equipes, buscar outros alunos e/ou professores, buscar informações etc. <br>
<br>Repare que todos os requisitos funcionais se resumem a um verbo, a uma ação a ser executada dentro do software.<br>
    <br>
 </p>
 </div>
 <div align="center">
  <img src="Requisitos-Funcionais.drawio.png" alt="esquematização dos requisitos funcionais" width="600" height="500">
  <br>
  </div>
  
  <br>
  <b> B) Requisitos não funcionais: </b>
    <br>
  <br> <p align="justify">Como os <b>requisitos funcionais</b> definem tudo <b>o que</b> o sistema fará, cabem aos <b>requisitos não funcionais</b> estabelecer <b>como</b> o sistema fará, ou seja, não têm relação direta com as funções do sistema, mas as qualificam, as restringem e até mesmo as padronizam, podendo ainda exigir soluções bem específicas, daí a transversalidade desses requisitos, que muitas vezes precisam ser resolvidos no âmbito da arquitetura do software e não da programação.<br>
<br>Por esse motivo também são chamados de atributos de qualidade, já que abordam aspectos de qualidade importantes em sistemas de software. Portanto, a não observância dos requisitos não funcionais pode levar à inconsistência e baixa qualidade do software.<br>
<br>Os requisitos não funcionais da plataforma de ensino fictícia foram baseados nas 10 heurísticas de Nielsen, que são regras gerais de usabilidade com foco na fluidez e intuitividade.<br>
    <br>
 </p>
 </div>
 
 <div align="center">
  <img src="Requisitos-Não funcionais.drawio.png" alt="esquematização dos requisitos não funcionais" width="900" height="600">
 <br>

</div>

→ [Voltar ao topo](#topo)

<div id="#projeto">
  
  ## 📐Projeto
  
<p align="justify">Na hora de planejar e elaborar um software o ideal é criar um diagrama de classes, pois é essa ferramenta que traz a representação da estrutura e das relações das classes que servem de modelo para os objetos.<br>
<br>Identificando os objetos e encontrando suas respectivas classes, automaticamente é possível obter a tabela do banco de dados, daí a importância do diagrama de classes nesse momento. Esse processo é tecnicamente definido como abstração dentro da programação orientada a objetos (POO).<br>
  <br>
  </p>
  </div>
  <div align="center">
  <img src="diagrama_revisado.drawio.png" alt="desenho do diagrama de classes" align="center">
  <br>
  <br>
</div>

→ [Voltar ao topo](#topo)

<div id="#desenvolvimento">
  
  ## 💻Desenvolvimento
  
<p>Nessa etapa foi usada a linguagem Java para codificar cada uma das classes criadas na etapa anterior.</p>
  
</div>

<div align="center">
  
  <img src="Classe-Pessoa.png" alt="diagrama da classe Pessoa">
</div>
<br>

```Java
    public class Pessoa {

        private String nome;
        private String matricula;
        private String tipo;
    
        public Pessoa(String nome, String matricula, String tipo){
            this.nome = nome;
            this.matricula = matricula;
            this.tipo = tipo;
        }
    
        public String getNome(){
            return nome;
        }
        
        public void setNome(String novoNome){
            this.nome = novoNome;
        }
        
        public String getMatricula(){
            return matricula;
        }
        
        public void setMatricula(String novaMatricula){
            this.matricula = novaMatricula;
        }
        
        public String getTipo(){
            return tipo;
        }
    
        public void setTipo(String novoTipo){
            this.tipo = novoTipo;
        }
    }
```

<br>
<div align="center">
  
  <img src="Classe-Disciplina.png" alt="diagrama da classe Disciplina">
</div>
<br>

```Java

     public class Disciplina {
        private String nomeDisciplina;
        private String docente;
        private String semestre;

        public Disciplina(String nomeDisciplina, String docente, String semestre) {
            this.nomeDisciplina = nomeDisciplina;
            this.docente = docente;
            this.semestre = semestre;
        }

        public String getNomeDisciplina() {
            return nomeDisciplina;
        }
        
        public void setNomeDisciplina(String novoNomeDisciplina) {
            this.nomeDisciplina = novoNomeDisciplina;
        }

        public String getDocente() {
            return docente;
        }
        
        public void setDocente(String novoDocente) {
            this.docente = novoDocente;
        }

        public String getSemestre() {
            return semestre;
        }
        
        public void setSemestre(String novoSemestre) {
            this.semestre = novoSemestre;
        }
    }

```

<br>
<div align="center">
  
  <img src="Classe-Plataforma.png" alt="diagrama da classe Plataforma de Ensino">
</div>
<br>

```Java


    import java.util.LinkedList;
    import java.util.List;

    public class PlataformaDeEnsino {
        private List<Pessoa> pessoas = new LinkedList<Pessoa>();    
        private List<Disciplina> disciplinas = new LinkedList<Disciplina>();
    
        public void cadastrarPessoa(Pessoa pessoa){
            pessoas.add(pessoa);
        }
    
        public Pessoa buscarPessoaPorNome(String nome){
            for(Pessoa pessoa:pessoas){
                if(pessoa.getNome().equals(nome)){
                    return pessoa;
                }
            }
            return null;
        }
    
        public Pessoa buscarPessoaPorMatricula(String matricula){
            for(Pessoa pessoa:pessoas){
                if(pessoa.getMatricula().equals(matricula)){
                    return pessoa;
                }
            }
            return null;
        }
    
        public Pessoa buscarPessoaPorTipo(String tipo){
            for(Pessoa pessoa:pessoas){
                if(pessoa.getTipo().equals(tipo)){
                    return pessoa;
                }
            }
            return null;
        }
    
        public void cadastrarDisciplina(Disciplina disciplina){
            disciplinas.add(disciplina);
        }
    
        public Disciplina buscarDisciplinaPorNome(String nome){
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getNomeDisciplina().equals(nome)){
                    return disciplina;
                }
            }
            return null;
        }
    
        public Disciplina buscarDisciplinaPorDocente(String docente){
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getDocente().equals(docente)){
                   return disciplina;
                }
            }
            return null;
        }
    
        public Disciplina buscarDisciplinaPorSemestre(String semestre){
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getSemestre().equals(semestre)){
                    return disciplina;
                }
            }
            return null;
        }
    
    }

```
   
<br>

<div id="#dev">
  
> Larissa Diniz, 2022 :star2: <br>
> ❤️ [Github](https://github.com/laaridiniz)<br>
> 💙 [LinkedIn](https://www.linkedin.com/in/larissa-diniz-dev/)<br>

</div>

→ [Voltar ao topo](#topo)
  



