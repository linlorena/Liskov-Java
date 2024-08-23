# Sistema de Gerenciamento de Cursos 

## Descrição

Este projeto é um sistema de gerenciamento de cursos online, desenvolvido em Java, que implementa o Princípio de Substituição de Liskov (LSP) e promove alta coesão nas classes. O sistema permite a criação de cursos presenciais e online, além de gerenciar informações dos alunos.

## Classes Implementadas

- **Curso**: Classe base abstrata que representa um curso genérico, contendo atributos como nome e descrição, além de métodos para iniciar o curso e acessar os detalhes do curso.
- **CursoPresencial**: Subclasse de `Curso` que representa um curso presencial, adicionando o atributo `local` e métodos relacionados.
- **CursoOnline**: Subclasse de `Curso` que representa um curso online, adicionando o atributo `plataforma` e métodos relacionados.
- **Aluno**: Classe responsável por gerenciar as informações dos alunos, como nome e email.

## Princípio de Substituição de Liskov (LSP)

O Princípio de Substituição de Liskov (LSP) faz parte dos princípios SOLID de design orientado a objetos e afirma que **uma classe derivada deve poder ser substituída por sua classe base sem alterar o comportamento esperado do programa**. Isso significa que objetos de uma subclasse devem ser capazes de substituir objetos da superclasse sem causar erros ou resultados inesperados.

### Aplicação do LSP no Projeto

No nosso sistema, as classes `CursoPresencial` e `CursoOnline` são subclasses da classe abstrata `Curso`. Elas implementam o método `iniciarCurso()` de maneiras específicas, mas sem quebrar o contrato estabelecido pela superclasse. Isso permite que qualquer instância de `Curso`, seja `CursoPresencial` ou `CursoOnline`, possa ser usada de forma intercambiável, garantindo a conformidade com o LSP.

Por exemplo, o método `iniciarCurso()` pode ser chamado em uma referência do tipo `Curso`, sem a necessidade de saber se o curso é presencial ou online, pois ambas as subclasses fornecem uma implementação válida deste método.
