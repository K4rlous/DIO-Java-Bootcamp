# BootCamp Bradesco 2025 ☕

## 🚀 Introdução à plataforma Java:

**Pilares POO** - Classes e objetos, Encapsulamento, Abstração, Herança, Polimorfismo

Código → Bytecode → ....

Bytecode e JVM tornam o Java 

A JVM transforma o Bytecode em algoritmo que será interpretado pelo sistema! 🖥️

**WORA** (Write once, run anywhere) 🌍

**Robustez**: Gerenciamento de memória forte, coleta de lixo, tratamento de exceção e mecanismos de verificação de tipo de dados 💪

**Segurança**: Recursos de criptografia e descriptografia 🔐

Java compila gerando Bytecode e a JVM (Java Virtual Machine) interpreta o arquivo em Bytecode durante a execução

**Thread** = subprocesso leve e independente de um programa em execução, Java é multithread logo possui vários threads sendo executados simultaneamente 🧵

**Java** = Cidade de origem de um tipo de café ☕

## 🛠️ Ambiente de desenvolvimento Java

Funções com autocomplete e inteliSense, formatação de palavras e blocos de Código, análises de erro de sintaxe, compilação de programas e depuração (acompanhamento) de execução do programa

**IDEs principais**: Eclipse, Netbeans, Intellij, Vscode 💻

**Maven** = Umas das formas de empacotamento de projetos em java, ferramenta de automação de compilação também usada para construir e gerenciar projetos escritos em C#, Ruby, Scala, e outras linguagens 📦

**Snippet** = Termo de programação para uma pequena região de código-fonte reutilizável, código de máquina ou texto. Normalmente, estas são unidades operacionais formalmente definidas para serem incorporadas em módulos de programação maiores. ✂️

Instalar o JDK (Vscode automotiza com o Java Coding pack, que inclui o Vscode, JDK e extensões úteis e essenciais!) ele também pode ser usado para atualizar um Vscode sem o JDK e as extensões! 📥

O Eclipse possui versões (packages) para desenvolvimento Java puro e uma versão específica para desenvolvimento Web! a escolha de diretório no Eclipse é meio chata, mas uma convenção legal é: `c/dev/ws/'trabalho'` / dev de desenvolvimento, ws de workspace! e `c/dev/projetos/'projeto'` para projetos! 📁

**JDK PATH** = `c://Arquivos de Programas / Java / JDK` (várias versões?) 📍

No CMD `java -version` retorna a versão atual do Java instalado 🔍

Todo projeto Java sem um sistema de gerenciamento de projetos (como o Maven) possui pastas como 'lib', 'src' e arquivos que documentam a estrutura do projeto como um todo como o 'readme' que inclui informações sobre o projeto 📋

A integração do Vscode com o Github, permite usar o Gitclone no Vscode para clonar nossos repositórios, **CTRL + SHIFT + P** para criar novos projetos Java e ver outras funcionalidades! ⌨️

**JRE** (Java Runtime Enviroment) é necessário apenas para rodar código Java, e não desenvolver! ▶️

### As quatro principais plataformas de desenvolvimento Java são: 🏗️
- Java SE (Java Platform, Standard Edition)
- Java EE (Java Platform, Enterprise Edition)
- Java ME (Java Platform, Micro Edition)
- Java FX

## 📚 Versionamento de Código com Git e GitHub 

Controlam as versões de um arquivo ao longo do tempo, registram histórico de atualizações do arquivo, gerenciam quais foram as alterações, datas, autores e etc. Organização, Controle e Segurança 🔄

### Tipos: 
**VCS Centralizado (CVCS)** = Centralizam os dados em um servidor ← se ficar fora do ar o projeto fica inacessível, se houver perca de dados (e tu não tiver backup) todo o projeto é perdido 🏢

**VCS Distribuido (DVCS)** = Clona o repositório incluindo o histórico de versões, cada clone é como um backup, possibilita fluxo de trabalho flexivel, possibilita trabalhar sem rede de internet! 🌐

O Git é um sistema de controle de versão distribuído amplamente usado por desenvolvedores para gerenciar projetos de software. Ele permite que você acompanhe mudanças no código, trabalhe em equipe simultaneamente e volte a versões anteriores quando necessário. O Git organiza o histórico de alterações em "commits", facilitando o rastreamento e a colaboração eficiente. Com ele, você pode criar ramificações (branches) para desenvolver novos recursos ou corrigir bugs sem afetar o código principal. 🔀

### Comandos principais:
- `git clone` → Clona um repositório git existente para um novo diretório local 📥
- `git commit` → Salva as alterações no repositório 💾
- `git pull` → Puxa as alterações do repositório remoto para o local (busca e mescla) ⬇️
- `git push` → Empurra as alterações do repositório local para o remoto ⬆️

**commit → pull → push** 🔄

`git --version` no CMD pra ver a versão do Git 🏷️

**GitBash** (Aberto em algum diretório) permite usar comandos para configurar o Git / **CTRL + L** limpa o terminal! 🧹

`git config` - permite ver alterações, tais como alterar as variáveis de configuração

Como todos os nossos repositórios tem de estar em nosso nome as alterações devem estar em escopo global 🌍

### Configurações:
- `git config --global user.name "Fulano"` / Definir o nome do usuário 👤
- `git config --global user.email fulano@gmail.com` / Definir o email do usuário 📧

Ambos comandos sem argumentos (nome ou email) vão retornar os nomes e emails respectivamente usados

Esses dados serão vinculados aos commits, mudar o nome ou email não irá alterar commits já feitos! ⚠️

- `git config init.defaultBranch` / Retorna o nome da branch 🌿
- `git config --global init.defaultBranch algo` / Muda o nome da branch para 'algo'
- `git config --global --list` / Lista todas as configurações globais (sem o global ia mostrar tudo) 📝

O Github é uma plataforma de hospedagem de código para controle de versão com Git e colaboração 🐙

(Ela fez o login no Git com o Token do Github??) 🔑
Nós usamos SSH para logar (Secure Shell) OU NÃO? 🔐

### Credenciais:
- `git config --global credential.helper store` / Salva as credênciais 💾
- `git config --global credential.helper cache` / Salva temporariamente (util se dividir a máquina) ⏰
- `git config --global credential.helper` / Mostra como está salvando ℹ️
- `git config --global --show-origin credential.helper` / Mostra onde as credênciais estão salvas e o 'modo' dela 📍

## 🏗️ Criando e Clonando Repositórios

Existem duas formas de obter um repositório Git na sua máquina: 
1. Transformando um diretório local que não está sob controle de versão, num repositório Git 📁
2. Clonando um repositório Git existente 📥

### Comandos do GitBash

#### 1° Forma:
```bash
mkdir repo-local       # Cria o diretório 'repo-local' 📁
cd repo-local          # Muda o diretório para 'repo-local' 📂
git init               # Transforma o diretório atual em um repositório git (main) 🎯
cd .git                # Muda o diretório para 'git' (git_dir) 🔧
ls                     # Lista os arquivos (entre eles há um arquivo de configurações) 📋
cat config             # Mostra os dados do arquivo de configurações mencionado. 👀
```

#### 2° Forma:
Copia-se o código https do repositório no Github 📋
```bash
git clone 'url'                      # Copia o repositório da url 📥
git clone 'url' 'nome'               # Copia o repositório da url e muda o nome da pasta para 'nome' 🏷️
```

### Comandos úteis:
- `git remote -v` / Mostra os repositórios remotos aos quais está vinculado 🔗
- `git remote add 'nome' 'url do repositório ao qual queremos vincular'` (padrão deixar o nome 'origin') / Conecta o repositório local com um repositório remoto 🔌
- `git clone 'url' --branch 'nome-da-branch' --single-branch` / Clona apenas a branch escolhida pelo nome, se não passar o nome ele clona a principal seja a 'main' ou a 'master' 🌿

## 📊 Status e Estados dos Arquivos

`git status` / é utilizado para verificar o estado atual do repositório Git. Ele informa quais mudanças foram realizadas, quais arquivos estão no estado "staged" (prontos para serem commitados), quais estão modificados mas ainda não "staged", e também destaca quaisquer arquivos não rastreados 🔍

### Estados dos arquivos:

**Untracked files** / Esses são arquivos que estão no diretório do seu projeto, mas o Git ainda não está rastreando. Eles não fazem parte de nenhum commit. Para começar a rastreá-los, você precisa adicioná-los à área de stage usando git add. 👻

**Modified files** / São arquivos que foram alterados desde o último commit, mas ainda não foram adicionados à área de stage. Você pode prepará-los para o commit usando git add ou deixá-los como estão enquanto continua trabalhando neles. ✏️

**Staged files** / Esses arquivos foram adicionados à área de stage e estão prontos para serem incluídos no próximo commit. Um commit grava essas alterações no histórico do repositório. ✅

## 📝 Markdown

**Markdown** / Markdown é uma linguagem de marcação leve e simples, criada para formatar texto de forma fácil e legível. Com ela, você pode criar documentos estruturados que incluem cabeçalhos, listas, tabelas, links, imagens e mais, sem precisar de um editor de texto complexo. O destaque do Markdown é que o texto ainda é legível sem renderização, o que facilita tanto a escrita quanto a colaboração. ✍️

Use o https://readme.so/pt para criar arquivos README decentes com linguagem markdown, um exemplo disso será visto no README do "Primeiro-Projeto-Java", use **WINDOWS + .** para usar emojis! 😊

## 💾 Comandos de Commit

- `git add 'arquivo.txt'` / é usado para adicionar arquivos ou mudanças ao "stage" (área de preparação), deixando-os prontos para serem incluídos no próximo commit. Em resumo, ele coloca suas alterações sob rastreamento do Git, `git add .` adiciona TODOS os arquivos ➕

- `git commit` / é usado para criar um commit, que registra as alterações preparadas na área de stage no histórico do repositório. O `-m` permite que você inclua uma mensagem descritiva diretamente no comando, explicando o que foi alterado. É uma prática recomendada escrever mensagens claras e informativas para facilitar o entendimento no futuro. `git commit -m "Adiciona funcionalidade X ao projeto"` 💬

- `git log` / O comando git log é usado para visualizar o histórico de commits do repositório. Ele lista os commits feitos, mostrando informações como o autor, a data e a mensagem associada a cada commit. É uma maneira de revisar o progresso do projeto, possui variações que incluem 1 linha ou mais, pesquise! 📜

- `touch arquivo.txt` / usado principalmente em sistemas baseados em Unix (como Linux e macOS) para criar arquivos vazios ou atualizar a data e hora de modificação de um arquivo existente. 📄

O git reconhece pastas vazias, alguns projetos possuem o arquivo gitkeep.txt dentro de diretórios, isso serve para o git reconhecer os diretórios 📁

## ↩️ Desfazendo alterações 

Vamos supor que você deu git init na pasta errada, era pra ser `/Nova pasta`, mas você colocou `/Nova pasta/.git/`, para remover isso basta usar:
```bash
rm -rf .git
```
e o sistema voltará para Nova 🗑️

Se apagarmos ou alterarmos um arquivo o git status indicará a mudança! caso queiramos reverter ela basta usar:
```bash
git restore arquivo.md
```
⚠️ **CUIDADO**, ele descarta todas as alterações feitas localmente!

### Alterar mensagem de commit (que por sua vez aparece no git log):
```bash
git commit --amend -m"mensagem nova!"
```

### Desfazer commit:
```bash
git reset --soft 'hashcode'
git reset --mixed 'hashcode'
git reset --hard 'hashcode'
```

**soft** / Mantém as mudanças na área de stage (prontas para o próximo commit). Útil se você quer desfazer um commit mas preparar as mesmas alterações para um novo commit. Isso desfaz o último commit, mas deixa os arquivos prontos para serem commitados novamente. 🔄

**mixed** / Remove as alterações da área de stage, mas as mantém nos arquivos de trabalho. Útil se você quer fazer ajustes antes de preparar os arquivos novamente. Isso desfaz o commit e remove os arquivos da área de stage, mas mantém os arquivos modificados. ⚡

**hard** / Desfaz o commit e descarta completamente as alterações nos arquivos. Desfaz o commit e descarta completamente as alterações nos arquivos. Isso desfaz o último commit e retorna o repositório ao estado anterior, descartando todas as mudanças ⚠️

`git reflog` / é usado para visualizar o histórico de referências de um repositório. Ele exibe uma lista de alterações feitas nas referências do Git (como commits, resets, merges, etc.), permitindo que você veja e recupere estados anteriores mesmo que tenham sido descartados do log normal. Ele ajuda a rastrear commits "perdidos" ou que foram sobrescritos. Pode ser usado para recuperar alterações depois de comandos como git reset --hard. (Cima = mais recente, baixo = menos recente!) 🔍

Forçar alterações nos commits pode causar problemas. É recomendado corrigir os problemas criando um novo commit! ⚠️

Abrir um repositório no github e apertar a tecla '.' vai abrir o projeto em um 'vscode online'! 💻

## 🌿 Branches

Ou branch é uma ramificação do projeto, um ponteiro móvel para um commit no histórico do repositório, quando você cria uma nova branch a partir de outra existente, a nova se inicia apontando para o mesmo commit da branch que estava quando foi 

```
commit 0 <-- commit 1 <-- commit 2(branch main)
```

a branch aponta para o commit 2, mas ele por si só aponta para o commit anterior

Quando se trabalha com múltiplas branches em um repositório Git, cada branch representa uma linha de desenvolvimento independente. Isso permite que diferentes alterações ou funcionalidades sejam desenvolvidas paralelamente sem interferir nas outras. Aqui está como funciona, Cada branch tem seu próprio ponteiro para um commit. Por exemplo:

```
main (commit 5) <-- commit 4 <-- commit 3
feature-x (commit 6) <-- commit 4 <-- commit 3
```

Nesse caso, main e feature-x compartilham parte do histórico, mas depois divergem 🔀

## 🔄 Comandos de Branch e Merge

`git checkout` / é usado principalmente para trocar entre branches ou restaurar arquivos, mas pode ter várias funcionalidades dependendo do contexto. Aqui estão os usos mais comuns:

**Trocar entre branches**: `git checkout nome-da-branch`

**Criar e mudar para uma nova branch**: `git checkout -b nova-branch`

**Restaurar arquivos ao estado de um commit específico**:
```bash
git checkout HEAD arquivo.txt
```
Isso restaura o arquivo ao último estado commitado.

**Restaurar o estado de todo o diretório**:
Caso queira desfazer todas as alterações não commitadas
```bash
git checkout HEAD .
```

`git merge` / O git merge serve para integrar as mudanças de uma branch em outra. Ele preserva o histórico de commits e une os trabalhos de diferentes desenvolvedores ou funcionalidades. 🔗
- Se não houver novos commits na branch de destino, o Fast-forward Merge é usado: ele simplesmente avança o ponteiro da branch sem criar um novo commit.
- Caso ambas as branches tenham novos commits, um Merge Commit é criado para registrar a combinação de mudanças.
- Se houver alterações conflitantes (ex.: o mesmo arquivo editado em ambas as branches), o Git solicita que você resolva manualmente antes de concluir o merge.

Exemplo básico:
```bash
git checkout main
git merge feature-x
```

Aqui, a branch feature-x será mesclada na main.

`git fetch` / O comando git fetch é usado para baixar atualizações de branches remotas (como commits, tags e metadados) para o repositório local, sem alterar as branches locais ou fazer merges. Ele sincroniza o repositório local com o remoto, permitindo que você veja as mudanças antes de aplicá-las ou integrá-las. Por exemplo, após um git fetch, você pode comparar as diferenças ou decidir fazer um merge ou rebase manualmente 📡

Para buscar de uma branch remota específica:
```bash
git fetch origin nome-da-branch
```

Para buscar de um repositório remoto específico (caso você tenha configurado mais de um):
```bash
git fetch nome-do-remoto
```

Por padrão, o git fetch pega todas as atualizações do repositório remoto associado (geralmente chamado de origin). Isso não altera sua branch local até que você decida aplicar as mudanças, como com git merge ou git pull.

## 🐛 Issues

Se criam uma issue de número 1, ao arrumarmos e darmos commit na solução do problema, usamos `fix #1` no nome do commit, dessa forma corrigimos a issue de número 1 🔧

# Sintaxe Java (Só vou anotar o que não sei/lembro) ☕

## 📝 Convenções de Nomenclatura

Cuidado com o CamelCase e etc, essas paradas de nomeação de classes, arquivos e etc. Normalmente variáveis tipo **FINAL**, **PI**, **EXEMPLO** (toda em maíuscula) indicam variáveis que não podem ser alteradas, uma variável int no estilo **ANO_2000** por si só já indica que é 2000 e não deve ser alteradas ⚠️

**Começo de variáveis**: letras, $, _ 

**expressão Final** em variável indica que ela não pode ser alterada = constante! 🔒

### 📦 Nomeação de pacotes:
Imagine uma empresa chamada HyperTech, ela possui vários setores, se o setor de comercio for fazer um projeto, seria legal usar esse padrão:
- `com.hypertech.'nomeDoProjeto'`
- com de comercio, e por ai vai, e podemos ter 
- `com.hypertech.'nomeDoProjeto'.app` pra inicializar
- `com.hypertech.'nomeDoProjeto'.modelo` pra por as classes de modelo
- `com.hypertech.'nomeDoProjeto'.util` para guardar os utilitários
- `com.hypertech.'nomeDoProjeto'.services` com regras de negócio e serviço

⚠️ **A CONVENÇÃO VARIA DE EMPRESA PARA EMPRESA**

e por ai vai, os pacotes (pastas) servem para ajudar a organizar os dados! 📁

**JavaBeans** são componentes reutilizáveis da plataforma Java que encapsulam dados e lógica de negócios, facilitando a comunicação entre diferentes partes de uma aplicação 🔄

Variável no plural só se for um arrray de coisas 📋

Funções com nomes de verbo, concluirProcessamento, Somar e por ai vai ⚡

`float` se encerra com F, `float pi = 3.14F` (f ou F) 🔢

**JavaDoc** é uma ferramenta utilizada para gerar documentação de código em Java com base em comentários no formato especial, facilitando a leitura e compreensão das funcionalidades de uma aplicação. 📚

## ▶️ Execução de Aplicações

Pra executar app fora da IDE é só achar a pasta bin com o `.class` que queremos rodar através do poweshell ou ms-dos e dar `java exemplo` sem o .class 🖥️

Quando você usa o comando `javac` para compilar um arquivo-fonte Java (.java), ele gera um arquivo de bytecode Java (.class). Esse arquivo .class contém o código que a Máquina Virtual Java (JVM) pode interpretar e executar.

Se, por exemplo, você tiver um arquivo `Programa.java`, ao rodar `javac Programa.java`, o compilador criará `Programa.class`. Depois, você pode executar esse programa com `java Programa`. 🔄

### 📥 Recebendo Argumentos:
O método main define um parâmetro `String[] args`, que é um array de strings contendo os argumentos passados quando o programa é executado.

### ⚙️ Atribuição de Valores:
O programa extrai os valores dos argumentos fornecidos:
- `args[0]`: O primeiro argumento é armazenado na variável nome.
- `args[1]`: O segundo argumento é armazenado na variável sobrenome.
- `args[2]`: O terceiro argumento, que representa a idade, é convertido para um número inteiro (int).
- `args[3]`: O quarto argumento, que representa a altura, é convertido para um número decimal (double).

### 🖨️ Exibição na Tela:
Utilizando `System.out.println()`, o programa imprime:
- Uma saudação com o nome e sobrenome.
- A idade informada.
- A altura informada em centímetros.

### EXEMPLO:
```java
public class Programa {
    public static void main(String[] args) {
        // Obtendo os argumentos da linha de comando
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        // Exibindo as informações
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
```
(é de se esperar que tudo seja String, então por isso o Parse nos outros tipos de dados!) 🔄

Se executarmos o programa com os seguintes argumentos:
```bash
java Programa Carlos Silva 25 175.5
```

Ele gerará a seguinte saída:
```
Ola, me chamo Carlos Silva
Tenho 25 anos
Minha altura é 175.5 cm
```

Dentro de um projeto Java no Vscode há uma pasta chamada `.vscode` que contém um arquivo `launch.json`, lá podemos definir os argumentos iniciais de execução de um programa! ⚙️

## 🐛 Debugging e Tratamento de Erros

Erros de programação são denominados **bugs** e o processo de encontrar e corrigir bugs é chamado de **depuração** ou **debugging**. 🔍

### Existem duas grandes categorias que englobam a natureza do erro:

#### ❌ Erros de Sintaxe:
É um erro nas regras estabelecidas da linguagem:
- Parênteses, chaves, colchetes que abrem mas não fecham.
- Duas instruções sem um ponto-e-vírgula entre elas;
- Uma palavra-chave sendo usada numa posição inesperada.

#### 🤔 Erros de Semântica:
É um erro na "lógica do código", em sua semântica, o código está sintaticamente correto, porém não faz o que se esperava dele.
- Tentar dividir um número por uma String ou por zero.
- Atribuir um valor incoerente a um tipo de dado.
- Tentar fechar um arquivo que não foi aberto.

### 🔧 Depuração/Debugging
Linguagens de alto nível tornam a depuração mais fácil, pois fornecem mais ferramentas para identificar erros, como o tratamento de exceções.

Os depuradores funcionam assumindo o controle do tempo de execução de um programa e permitindo que você o observe e controle. Para fazer isso, ele mostra a pilha do programa e permite que você a atravesse em qualquer direção. Quando você está em um depurador, obtém uma imagem mais completa de um quadro de pilha do que quando olha os rastreamentos de pilha em uma mensagem de log.

### 📚 Pilha de Execução de um Programa Java/Stack Trace

#### Pilha de Execução:
Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um. Quando um método termina (retorna), ele volta para o método que o invocou.

#### Stack Trace:
É a matriz onde encontramos a pilha de excecução da exceção. Em outras palavras, podemos dizer que o rastreamento da pilha busca (rastreio) para a próxima linha onde a exceção pode surgir.

⚠️ **Lemos a stack trace de baixo para cima!**

`Tread.dumpStack()` imprime o rastreamento da pilha da thread atual no fluxo de erro padrão. Isso é útil para depuração, pois permite verificar onde uma thread está sendo executada em determinado momento. 🧵

### 🔴 Breakpoints
**Breakpoints** são essenciais para depuração em Java! Eles permitem que você pause a execução do programa em um ponto específico e analise o estado das variáveis e do fluxo de execução. Aqui estão alguns passos para usá-los em um ambiente de desenvolvimento como o IntelliJ IDEA ou Eclipse:

- **Definir um breakpoint** – Clique na margem esquerda ao lado de uma linha de código onde deseja que a execução pare.
- **Executar o programa no modo de depuração** – Use a opção de "Debug" ao invés de "Run".
- **Inspecionar variáveis** – Quando o programa parar no breakpoint, você pode examinar valores de variáveis no painel de depuração.
- **Passar pelas linhas** – Use os comandos "Step Over", "Step Into" e "Step Out" para navegar pelo código.
- **Modificar valores durante a execução** – Alguns IDEs permitem alterar valores de variáveis no meio da execução para testar diferentes cenários.

### ⌨️ Comandos de Depuração
Esses comandos de depuração ajudam a navegar pelo código em um ambiente de debug. Aqui está o que cada um faz:

**Step Over** (F8 no IntelliJ IDEA, F6 no Eclipse): Avança para a próxima linha de código sem entrar em métodos chamados na linha atual. Se houver uma chamada de método, ele será executado inteiramente e o depurador passará para a próxima linha no mesmo escopo.

**Step Into** (F7 no IntelliJ IDEA, F5 no Eclipse): Entra no método chamado na linha atual, permitindo inspecionar sua execução linha por linha.

**Force Step Into** (Alt + Shift + F7 no IntelliJ IDEA): Ignora otimizações da IDE e entra até mesmo em métodos da biblioteca padrão ou código compilado.

**Step Out** (Shift + F8 no IntelliJ IDEA, F7 no Eclipse): Sai do método atual e retorna ao seu chamador, útil para concluir rapidamente um método e voltar ao nível superior.

**Run to Cursor** (Alt + F9 no IntelliJ IDEA, Ctrl + R no Eclipse): Continua a execução até o ponto onde o cursor está, sem a necessidade de um breakpoint.

### 🔍 Evaluate Expression
O **Evaluate Expression** é uma ferramenta muito útil na depuração de código Java! Ele permite que você avalie expressões ou execute pequenas porções de código no contexto da execução atual do depurador, sem alterar o código-fonte.

Aqui estão alguns usos comuns:
- **Verificar valores complexos** – Você pode inserir qualquer expressão, como `myObject.getSomeValue()` e visualizar o resultado sem precisar imprimir no console.
- **Modificar valores temporariamente** – É possível alterar variáveis no meio da execução para testar diferentes cenários.
- **Testar chamadas de métodos** – Avalie um método antes de executá-lo no código principal, garantindo que ele retorna o valor esperado.
- **Expressões booleanas** – Confirme rapidamente se uma condição if será verdadeira ou falsa antes de prosseguir.

Ao debuggar pode ser necessário inserir dados no console, confirmar e apertar em step over para seguir a lógica do programa 📝

## 🔢 Tratamento de Números Decimais

### Jeito de aceitar vírgulas e pontos:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Digite um número decimal: ");
String input = scanner.nextLine().replace(",", "."); // Lê como string e substitui vírgula por ponto

try {
    double numero = Double.parseDouble(input); // Faz o parse para Double
    System.out.println("Número convertido: " + numero);
} catch (NumberFormatException e) {
    System.out.println("Entrada inválida!");
}
```

só pegar o input como string trocar a `,` por `.` e dar um parse depois! 🔄

## 🏗️ Arquitetura e Convenções de Classes

Em Java, especialmente em projetos que seguem padrões como a arquitetura em camadas (comum em aplicações Spring, por exemplo), há uma série de convenções para nomear e organizar classes com base em suas responsabilidades. Essas convenções ajudam a manter o código limpo, organizado e mais fácil de manter. Abaixo, explico as principais categorias de classes e suas convenções:

### 1. 📊 Modelos (Model / Entity)
**Função**: Representam entidades do domínio do negócio. Geralmente correspondem a tabelas em um banco de dados.

**Convenções**:
- Nome no singular e representativo do conceito de negócio: `User`, `Product`, `Order`.
- Normalmente anotadas com `@Entity` (em JPA/Hibernate).
- Contêm atributos com getters/setters, construtores e métodos auxiliares (como `equals()` e `hashCode()`).

### 2. 💾 Repositórios (Repository / DAO)
**Função**: Responsáveis pelo acesso a dados (CRUD – Create, Read, Update, Delete).

**Convenções**:
- Interface com sufixo `Repository` ou `Dao`: `UserRepository`, `ProductDao`.
- Usualmente estendem interfaces como `JpaRepository`, `CrudRepository`, etc.
- Anotados com `@Repository` (no Spring).
- Não contêm regras de negócio, apenas operações de persistência.

### 3. ⚙️ Serviços (Service)
**Função**: Contêm a lógica de negócio da aplicação.

**Convenções**:
- Nome com sufixo `Service`: `UserService`, `PaymentService`.
- Normalmente anotadas com `@Service`.
- Chamam métodos de repositórios e manipulam entidades.
- Implementam regras de negócio, validações e orquestrações de processos.

### 4. 🎮 Controladores (Controller)
**Função**: Camada de entrada da aplicação. Lidam com requisições HTTP.

**Convenções**:
- Nome com sufixo `Controller`: `UserController`, `OrderController`.
- Anotados com `@RestController` ou `@Controller`.
- Expõem endpoints com métodos anotados (`@GetMapping`, `@PostMapping`, etc.).
- Interagem com os serviços para processar as requisições.

### 5. 📦 DTOs (Data Transfer Objects)
**Função**: Objetos usados para transportar dados entre camadas (especialmente entre controller e client).

**Convenções**:
- Nome com sufixo `DTO`: `UserDTO`, `OrderResponseDTO`.
- Não contêm lógica de negócio.
- Podem ter validações com `@NotNull`, `@Size`, etc.

### 6. 🛠️ Utilitários e Helpers
**Função**: Contêm métodos auxiliares e utilitários reutilizáveis.

**Convenções**:
- Nome com sufixo `Utils` ou `Helper`: `DateUtils`, `StringHelper`.
- Métodos estáticos.
- Não devem depender de estado interno (idealmente stateless).

### 7. ⚙️ Configurações (Configuration)
**Função**: Classes que configuram aspectos da aplicação, como beans, segurança, CORS etc.

**Convenções**:
- Nome com sufixo `Config`: `SecurityConfig`, `CorsConfig`.
- Anotadas com `@Configuration`, `@Enable...`, `@Bean`, etc.

### 📋 Boas práticas gerais:
- Cada classe deve ter uma única responsabilidade.
- Os nomes devem ser descritivos e consistentes.
- Use pacotes separados para cada camada: `model`, `repository`, `service`, `controller`, etc.
- Classes públicas devem estar em arquivos com o mesmo nome da classe.

## 📦 Estrutura de Pacotes

Em Java, a criação de pacotes segue convenções que visam manter a organização, legibilidade e modularidade do código. Os nomes de pacotes devem ser escritos sempre em letras minúsculas, sem acentos ou caracteres especiais, e normalmente iniciam com o domínio da organização escrito de forma invertida, como por exemplo `com.empresa.projeto`. A estrutura dos pacotes costuma refletir a arquitetura da aplicação, sendo comum organizá-los por responsabilidade, como `model` para entidades de domínio, `repository` para interfaces de acesso a dados, `service` para regras de negócio, `controller` para endpoints REST, `dto` para objetos de transferência de dados e `config` para configurações gerais. Em sistemas maiores, é recomendável combinar essa estrutura com uma divisão por módulos de negócio, agrupando as camadas dentro de pacotes como `usuario.service`, `pedido.controller`, entre outros, o que facilita a manutenção e favorece a escalabilidade. Além disso, no Spring Boot, a classe principal com a anotação `@SpringBootApplication` costuma ficar no pacote raiz da aplicação, permitindo o escaneamento automático de todos os componentes nas subpastas. É importante evitar nomes genéricos ou pouco descritivos e manter uma hierarquia de pacotes clara, coerente e alinhada com o domínio da aplicação.

**basicamente dentro da src é só fazer um monte de pacote com cada pacote repleto de clases que variam de assunto para assunto!** 📁

## 🔒 Modificadores de Acesso

Em Java, a visibilidade de classes, métodos e atributos é controlada por modificadores de acesso, que determinam onde esses elementos podem ser acessados. O modificador `public` permite o acesso de qualquer lugar, inclusive de outras classes em pacotes diferentes. O modificador `protected` permite acesso dentro do mesmo pacote e também por subclasses, mesmo que estejam em pacotes distintos. O modificador **default** (também chamado de package-private), que ocorre quando nenhum modificador é especificado, permite o acesso apenas dentro do mesmo pacote, mas não fora dele. Já o modificador `private` restringe o acesso exclusivamente à própria classe onde o elemento foi declarado. Usar esses níveis de acesso corretamente é essencial para garantir o encapsulamento e proteger a integridade dos dados e da lógica da aplicação. 🛡️

## 🔢 Enums

Em Java, **enums** (ou tipos enumerados) são tipos especiais de classe usados para representar um conjunto fixo e constante de valores. Eles são ideais quando se deseja trabalhar com um grupo definido de opções, como dias da semana, estados de um pedido ou níveis de prioridade. Ao contrário de constantes tradicionais (`public static final`), enums oferecem mais segurança e funcionalidades orientadas a objetos, podendo ter atributos, métodos e até mesmo comportamentos personalizados.

Um enum é declarado com a palavra-chave `enum` e cada valor definido dentro dele é uma instância constante dessa enumeração. Por exemplo, um enum `DiaSemana` pode conter os valores `SEGUNDA`, `TERCA`, `QUARTA`, etc. Além de simples, os enums em Java podem ser estendidos com campos e construtores, permitindo associar valores ou comportamentos específicos a cada constante.

Internamente, enums são classes que herdam da classe `java.lang.Enum`, não podem ser instanciados diretamente (o construtor é sempre privado) e são imutáveis. Eles também são úteis em estruturas de controle como `switch` e ajudam a deixar o código mais legível, seguro e expressivo. Ao utilizar enums, evita-se o uso de "valores mágicos" e torna-se o código mais autodescritivo e menos propenso a erros. ⚡

## 📝 Records

**Records** em Java são uma forma concisa de criar classes imutáveis (um tipo especial de classe) que servem principalmente para armazenar dados. Introduzidos oficialmente no Java 16, eles geram automaticamente construtor, métodos `equals`, `hashCode` e `toString`, além de acessores (getters) com o nome do campo. Não podem herdar de outras classes, mas podem implementar interfaces. São ideais para representar objetos simples, como DTOs, com menos código, em record todo atributo declarado é privado, lemos seus atributos através de métodos, é possível ter um constrututor adicional, mas precisamos chamar o construtor default do record para isso, podemos passar valores padrões através dele então:

Se por o construtor default receber um nome e idade, podemos colocar o construtor default como super do construtor adicional e declarar a idade como '1', então todo objeto criado com o modelo do construtor secundário, isso é, só com nome e sem a idade, vai ficar no padrão "fulano" 1, "beltrano" 1, e por ai vai! ← **SOBRECARGA!** 🔄

```java
public record Pessoa(String nome, int idade) {}
```

Nesse exemplo:
- `nome` e `idade` são campos de instância (não estáticos)
- São implicitamente `private` e `final`
- Você acessa seus valores pelos métodos `nome()` e `idade()`

## 🔐 Sealed Classes

Uma **classe sealed** em Java é uma classe que pode ser estendida somente por classes específicas, definidas explicitamente usando a palavra-chave `permits`. Isso permite um controle mais rigoroso sobre a herança, garantindo que a classe não seja estendida por qualquer outra classe, apenas pelas que forem mencionadas.

### Características:
- `sealed`: Restringe as subclasses permitidas.
- `permits`: Lista as classes que podem estender a classe sealed.
- Subclasses podem ser:
  - `final`: Não podem ser estendidas.
  - `non-sealed`: Permitem outras classes para estendê-las.
  - `sealed`: Permite outras classes, mas só com permissões explícitas.

```java
public sealed class Animal permits Dog, Cat { ... }
public final class Dog extends Animal { ... }
public non-sealed class Cat extends Animal { ... }
```

Essa abordagem oferece controle e segurança sobre a herança e pode ser usada para otimizações de desempenho no compilador. 🛡️

# 📚 Collections

Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade (variável); estes elementos precisam ser objetos (SEM TIPOS PRIMITIVOS!).  
Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo específico.  
O núcleo principal das coleções é formado pelas interfaces da figura abaixo; essas interfaces permitem manipular a coleção independentemente do nível de detalhe que elas representam.  
Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa). A partir dessas interfaces, temos muitas subclasses concretas que implementam várias formas diferentes de se trabalhar com cada coleção.

Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.  
Embora a interface Map não seja filha direta da interface Collection, ela também é considerada uma coleção devido à sua função.

🔗 https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html <- SUMARIO DE MÉTODOS!  
🔗 https://github.com/cami-la/collections-java-api-2023/tree/master/src/main/java <- RESUMÃO PRA CONSULTA POSTERIOR

🧬 Generics permitem iterar sobre listas de forma mais simples sem fazer cast!  
🧠 Maps com generics permitem declarar estritamente o tipo de dado e mais uma vez permitem iterações sem cast!

🔄 Em Java, Comparable e Comparator são duas interfaces utilizadas para realizar ordenações de objetos.

📏 A interface Comparable define a ordem natural de uma classe. Quando uma classe implementa Comparable, ela precisa sobrescrever o método compareTo(), que define como os objetos dessa classe serão comparados entre si. Isso é útil quando a própria classe tem uma forma principal e única de ser ordenada — por exemplo, ordenar produtos pelo preço.

🧪 Já a interface Comparator é usada quando queremos definir várias maneiras diferentes de comparar objetos. Ela é implementada em uma classe separada (ou por uma expressão lambda), que sobrescreve o método compare(). Isso é útil quando precisamos ordenar os mesmos objetos de formas diferentes, como por nome, data ou outro critério específico.

⚖️ A principal diferença entre elas é que Comparable define a ordenação dentro do próprio objeto, enquanto Comparator permite definir ordenações externas e múltiplas, oferecendo maior flexibilidade.

# 🔁 Stream API

É uma ferramenta que permite processar coleções de forma funcional, declarativa e concisa. Ela facilita operações como filtrar, mapear, ordenar, agrupar e reduzir elementos de listas, arrays e outras fontes de dados.

🗨️ bla bla bla

🧩 DRAW.IO PRA FAZER DIAGRAMAS!!!!!

# 🚀 SpringBoot

Framework opensource recheado de módulos para diferentes coisas como web dev, bancos e dados, testes unitarios e etc.

🔄 Inversão de controle é redirecionar o fluxo de execução do código retirando parcialmente o controle sobre ele e delegando-o para um container, pra minimizar o acoplamento.  

📦 Injeção de dependências é um padrão de desenvolvimento com a finalidade de manter o baixo nível de acoplamento entre módulos de um sistema.

🧱 Beans são objetos instanciados (Criados), montados e gerenciados por um container através do princípio da inversão de controle.

♻️ Singleton: o container do Spring IoC (Inversão de Controle) define apenas uma instância do objeto.

🔂 Prototype: será criado um novo objeto a cada solicitação ao container.

📡 Request: um bean é criado para cada requisição HTTP, e existirá enquanto a requisição estiver em execução.

🧑‍💻 HTTP Session: um bean será criado para a sessão de usuário, precisamos acessar a mesma solicitação duas vezes para testar os escopos específicos da web.

🌐 HTTP Global (Application Scope): cria um bean para o ciclo de vida do contexto da aplicação.

📍 @Autowired: anotação que indica onde deverá ocorrer uma injeção automática de dependência.

🔠 byName: é buscado um método set que corresponde ao nome do Bean.  
🔢 byType: é considerado o tipo da classe para inclusão do Bean.  
🏗️ byConstructor: usamos o construtor para incluir a dependência.

📦 Starters são pacotes prontos (dependências) que o Spring Boot oferece para facilitar a inclusão de funcionalidades na sua aplicação. Eles agrupam várias bibliotecas comuns em um só lugar, para que você não precise configurar tudo manualmente.

## 🧰 Principais Starters do Spring Boot

| Starter                         | Para que serve                                       |
|----------------------------------|--------------------------------------------------------|
| spring-boot-starter-web         | Aplicações web, APIs REST                             |
| spring-boot-starter-data-jpa    | Integração com banco de dados usando JPA/Hibernate    |
| spring-boot-starter-security    | Segurança e autenticação                              |
| spring-boot-starter-test        | Testes unitários e de integração                      |
| spring-boot-starter-thymeleaf   | Templates HTML usando Thymeleaf                       |
| spring-boot-starter-actuator    | Monitoramento da aplicação em tempo real              |
| spring-boot-starter-validation  | Validações com Bean Validation (JSR-380, ex: @NotNull, @Email) |
| data-mongodb                    | Interação com banco de dados MongoDB                  |

# 🛠️ Primeiros passos

🧱 Criando um projeto com Spring Initializr  
Monte como quiser e adicione as dependências, ele vai baixar um .zip

📂 Importando o projeto Maven no VSCode  
Tecnicamente ele baixa todas as dependências automaticamente.

📁 Conhecendo a estrutura Spring Boot  
Segue o mesmo padrão do Java.  
O arquivo `pom.xml` tem informações sobre o projeto.  
`src/main/resources/application.properties` é onde colocamos configurações como portas de servidores, dados de conexão, etc.

# ⚙️ Bean e CommandLineRunner

🚫 Em Spring Boot não usamos `new`, é errado instanciar classes dessa forma. Nada de:  
```java
Pessoa pessoa = new Pessoa("Carlos");
```

✅ Nosso método main ou `App.java` precisa implementar a interface `CommandLineRunner` e seus métodos.  
Logo abaixo das importações, devemos indicar que ele usará componentes com a anotação `@Component`.  
Fazemos o mesmo nas classes que queremos instanciar!

E abaixo da classe instanciamos assim:
```java
@Autowired
private Pessoa pessoa;
```

🧩 Use `@Component` quando você quer que o Spring crie e gerencie uma instância de uma classe automaticamente.  
Onde usar:  
- Direto em cima de uma classe que você criou.  
- Quando quer que o Spring descubra a classe automaticamente via component scanning.

Exemplo:
```java
@Component
public class MeuServico {
    public void executar() {
        System.out.println("Executando serviço...");
    }
}
```

🔧 Use `@Bean` quando você quer registrar manualmente um objeto como bean no Spring.  
É usado dentro de uma classe anotada com `@Configuration`.  
Onde usar:  
- Em métodos de fábrica dentro de classes de configuração.  
- Quando precisa criar instâncias de classes de terceiros.  
- Quando precisa de lógica personalizada para criar o bean.

Exemplo:
```java
@Configuration
public class ConfiguracaoApp {

    @Bean
    public MeuServico meuServico() {
        return new MeuServico();
    }
}
```

🧠 Diferença prática

| Característica         | @Component                      | @Bean                                 |
|------------------------|----------------------------------|----------------------------------------|
| Onde usar              | Em uma classe                    | Em um método                           |
| Tipo de controle       | Spring instancia automaticamente | Você instancia manualmente             |
| Flexibilidade          | Menos flexível                   | Mais controle na criação do objeto     |
| Ideal para             | Suas próprias classes            | Bibliotecas de terceiros/lógica custom |

🕵️‍♂️ Quando usar cada um?

| Situação                                        | Use        |
|------------------------------------------------|------------|
| Classe é sua e simples                         | @Component |
| Classe precisa ser configurada com parâmetros  | @Bean      |
| Classe vem de uma biblioteca externa           | @Bean      |
| Você quer controle sobre como o objeto é criado| @Bean      |

📌 É uma convenção criar uma classe `Beans` para agrupar os beans!  
Às vezes é necessário usar `@Configuration` acima da classe mencionada para evitar erro na injeção de dependência.

🧭 Se tem acesso ao código fonte use `@Component`, do contrário, `@Bean`.

# 🧪 O que é escopo (Scope) de um bean?

No Spring, um bean é um objeto gerenciado pelo container da aplicação. O escopo define quantas instâncias desse objeto serão criadas e como elas serão entregues quando forem requisitadas.

## ♻️ Singleton (padrão do Spring)

**O que é?**  
É o escopo padrão no Spring. Significa que o Spring cria apenas uma única instância do bean durante toda a vida da aplicação.

**Quando usar?**  
Quando o bean não precisa ser recriado a cada uso, ou seja, pode ser compartilhado por toda a aplicação.

**Vantagens:**  
- Consome menos memória.  
- Ideal para serviços ou repositórios que mantêm estado compartilhado ou são stateless (sem estado).

Exemplo:
```java
@Component
public class MeuServico {
    // será criada apenas uma instância de MeuServico
}
```
## 🌀 Prototype

**O que é?**  
Um bean com escopo `prototype` será criado novamente toda vez que for solicitado ao Spring.

**Quando usar?**  
Quando você precisa de uma nova instância para cada uso — por exemplo, quando o bean tem estado próprio e não pode ser compartilhado.

**Vantagens:**  
- Útil para objetos com estado temporário ou dados dinâmicos.  
- Evita efeitos colaterais entre usuários ou requisições.

**Exemplo:**
```java
@Scope("prototype")
@Component
public class Pedido {
    // cada vez que for requisitado, um novo Pedido será criado
}
```

---

## ⚙️ application.properties e @Value

No Spring Boot, o arquivo `application.properties` serve para guardar configurações da aplicação, como nomes, URLs ou chaves. A anotação `@Value` é usada para ler essas configurações e injetá-las dentro do código.

**Exemplo:**
```properties
app.nome=MinhaApp
```

```java
@Value("${app.nome}")
private String nomeApp;
```

📌 Isso ajuda a manter o código limpo, separado da configuração, e facilita a troca de valores conforme o ambiente (dev, prod, etc.).

🛑 Se a propriedade não for encontrada, a aplicação pode dar erro, mas é possível definir um valor padrão com dois pontos:
```java
@Value("${app.autor:Desconhecido}")
```

---

## 🧩 @ConfigurationProperties

`@ConfigurationProperties` é uma forma do Spring de carregar várias configurações de uma vez em uma classe, ao invés de usar vários `@Value`. Ela é usada para mapear um grupo de propriedades do `application.properties` para atributos de uma classe Java.

🔧 Em vez de injetar um por um com `@Value`, você define uma classe com atributos e o Spring preenche tudo de forma automática com base no prefixo configurado.

**Exemplo:**
```properties
app.nome=MinhaApp
app.versao=1.0
```

```java
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String nome;
    private String versao;
    // getters e setters
}
```

📍 O Spring vai preencher `nome` e `versao` automaticamente com os valores definidos.

✅ A classe precisa estar registrada como bean (`@Component` ou usando `@EnableConfigurationProperties`).  
✅ Requer métodos `get` e `set` (ou uso de `@Data` do Lombok, por exemplo).

---

## 💡 Lombok

Lombok é uma biblioteca Java que simplifica a escrita de código Java, reduzindo código boilerplate (código repetitivo e comum, como getters e setters) através do uso de anotações.

---

## 🗃️ ORM e JPA

No contexto do Spring Boot, os conceitos de **ORM** e **JPA** são fundamentais para facilitar o trabalho com bancos de dados de forma orientada a objetos.

### ORM (Object-Relational Mapping)

- É uma **técnica** que mapeia **objetos Java para tabelas** de um banco de dados relacional.
- Em vez de escrever SQL diretamente, você manipula **objetos Java**, e o ORM cuida da conversão.

---

### JPA (Java Persistence API)

- É uma **especificação Java** para ORM.
- Não implementa ORM diretamente — quem faz isso são **implementações como o Hibernate**.
- Com Spring Boot, usamos **Spring Data JPA**, que integra o Hibernate automaticamente.

### Anotações principais:
```java
@Entity         // Marca a classe como entidade do banco
@Table(name="tabela") // (opcional) define nome da tabela
@Id             // Identifica a chave primária
@GeneratedValue // Define estratégia de geração de IDs
@Column         // Mapeia uma coluna
```

### Relacionamentos:
- @OneToOne  
- @OneToMany  
- @ManyToOne  
- @ManyToMany  

---

### EntityManager

É o **componente central da JPA** para gerenciar o ciclo de vida das entidades.

```java
@PersistenceContext
private EntityManager entityManager;

entityManager.persist(cliente);
Cliente c = entityManager.find(Cliente.class, 1L);
entityManager.remove(c);
```

---

## ⚙️ Spring Data JPA

**Spring Data JPA** é uma extensão da JPA para o Spring Boot.  
Ele **simplifica o acesso a dados** criando métodos automáticos a partir do nome das funções.

📁 Crie um repositório assim:
```java
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
}
```

### Vantagens:

- Métodos prontos: `save()`, `findAll()`, `findById()`, `delete()`, etc.  
- Criação automática de consultas: `findByEmailAndStatus()`, etc.  
- Suporte a @Query, JPQL, SQL nativo  
- Suporte a paginação e ordenação com `Pageable` e `Sort`  
- Integração perfeita com Spring Security, Web, Boot...

### Integrações:
Para usar com **PostgreSQL**, adicione a dependência do driver no seu `pom.xml` e configure:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seubanco
spring.datasource.username=usuario
spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

📦 O Spring Data JPA é adicionado via Spring Initializr, junto com a dependência do banco que será usado.

---

# 📚 Guia Spring Boot + PostgreSQL + REST API

## 🐘 Configuração do PostgreSQL

### 📦 Maven
No Maven, a dependência do PostgreSQL deve ser adicionada ao arquivo pom.xml da seguinte forma:

```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

### 🐘 Gradle
Caso esteja usando Gradle, a linha correspondente no build.gradle seria:

```gradle
runtimeOnly 'org.postgresql:postgresql'
```

## ⚙️ Configuração da Conexão

Depois disso, o próximo passo é configurar a conexão no arquivo application.properties. As propriedades básicas incluem:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nomedobanco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
```

Essas configurações definem a URL de conexão JDBC com o PostgreSQL (onde localhost é o host, 5432 é a porta padrão e nomedobanco é o nome do seu banco de dados), além do nome de usuário e senha. O hibernate.ddl-auto=update faz com que o Hibernate atualize automaticamente o schema do banco conforme as entidades, útil durante o desenvolvimento. A propriedade show-sql=true exibe as queries SQL no console, o que ajuda na depuração.

Além disso, é importante garantir que o serviço do PostgreSQL esteja rodando e que o banco e as credenciais especificadas existam. Para projetos maiores ou ambientes de produção, outras propriedades como connection pool, caching, e logging podem ser ajustadas.

## 🗃️ JpaRepository

O JpaRepository é uma interface do Spring Data JPA que fornece um conjunto completo de métodos prontos para realizar operações de persistência em entidades JPA. Ela faz parte da infraestrutura que facilita a integração entre o Spring Boot e a JPA, evitando a necessidade de escrever implementações manuais de acesso a dados.

Ao estender a interface JpaRepository, o desenvolvedor herda métodos para operações comuns como salvar (save), buscar por ID (findById), buscar todos (findAll), deletar (delete), entre outros. Isso permite focar na lógica de negócio, sem a necessidade de escrever código repetitivo de acesso a banco.

Por exemplo, em vez de criar uma implementação para um repositório de clientes, basta criar uma interface como ClienteRepository estendendo JpaRepository<Cliente, Long>, onde Cliente é a entidade e Long é o tipo do ID. Com isso, o Spring gera automaticamente a implementação dos métodos de CRUD.

Além dos métodos herdados, o JpaRepository permite definir métodos personalizados com base na nomenclatura. Por exemplo, um método findByNome(String nome) é interpretado automaticamente pelo Spring como uma consulta para buscar clientes pelo campo nome.

O JpaRepository também oferece suporte a paginação, ordenação, projeções, e consultas personalizadas usando anotações como @Query (com JPQL ou SQL nativo).

Por estar integrado com o Spring Boot, o uso de JpaRepository também se beneficia da injeção de dependência e da configuração automática de componentes, tornando o desenvolvimento rápido, organizado e aderente às boas práticas do Spring.

## 🌐 REST e RESTful

### 🏗️ REST
REST (Representational State Transfer) é um estilo de arquitetura de software para sistemas distribuídos, geralmente usado na construção de APIs. Ele se baseia em um conjunto de restrições, como a utilização de HTTP para comunicação e a utilização de métodos como GET, POST, PUT e DELETE. O REST enfatiza a simplicidade e a escalabilidade.

### ✅ RESTful
RESTful refere-se à implementação de uma API que segue as restrições e princípios do REST. Isso significa que a API deve ser baseada em recursos (URLs) e deve utilizar os métodos HTTP de forma adequada.

## 🎮 Controllers

Controllers (ou controladores) são componentes essenciais na arquitetura de software, particularmente no padrão MVC (Model-View-Controller). Em APIs RESTful, os controladores são responsáveis por manipular as requisições HTTP, interagir com os modelos de dados (como banco de dados) e retornar as respostas apropriadas ao cliente. Os controladores mapeiam as rotas de requisição para as funções específicas que devem ser executadas.

## 📋 Swagger

Swagger é uma ferramenta que permite documentar, testar e visualizar APIs de forma interativa. Ela gera documentação interativa de uma API RESTful e permite que os desenvolvedores e usuários interajam diretamente com a API através de uma interface gráfica. Com o Swagger, é possível ver as operações disponíveis, os parâmetros necessários e até testar as chamadas da API de maneira fácil.

## ⚠️ Exception Handler

Exception Handler (ou manipulador de exceções) é um mecanismo utilizado em APIs para tratar erros de maneira adequada. Ele captura exceções (erros) que ocorrem durante o processamento das requisições e fornece respostas apropriadas, como mensagens de erro ou códigos de status HTTP (por exemplo, 404 para "não encontrado" ou 500 para "erro interno do servidor"). O tratamento adequado de exceções é fundamental para garantir que a API seja robusta e fácil de usar, fornecendo informações claras sobre o que deu errado.

---

💡 Esses são conceitos fundamentais no desenvolvimento de APIs modernas, especialmente quando se busca construir sistemas escaláveis, robustos e bem documentados.

# 🗄️ Bancos de Dados Relacionais!

## 💻 DBMS (Sistema de Gerenciamento de Banco de Dados)

DBMS é o software usado para acessar, manipular e monitorar um sistema de banco de dados! ele é diferente do proprio DB é mais como uma interface gráfica e cada DB tem o seu próprio

MySQL express ou pra dev são iguais, mas use a versão express! pro Mysql precisa de SSMS também (as vezes instalado diretamente do setup do Mysql) ou através do site da microsoft

## 📊 MER – Modelo Entidade-Relacionamento

MER (Modelo Entidade-Relacionamento) é uma abordagem conceitual de modelagem de dados, proposta por Peter Chen em 1976. Ele serve para representar de forma abstrata e sem preocupação com tecnologia como os dados se relacionam entre si no domínio do problema.

### 🧩 Principais componentes do MER:

**🔲 Entidade:** Representa um "objeto" do mundo real (ex: Cliente, Produto).
- Representado como retângulo.

**⭕ Atributo:** Propriedade ou característica da entidade (ex: nome, CPF).
- Representado como elipse.

**🔶 Relacionamento:** Mostra como as entidades estão conectadas (ex: "compra", "possui").
- Representado como losango.

**🔢 Cardinalidade:** Indica a quantidade de ocorrências entre as entidades (1:1, 1:N, N:N).
- Exemplo: Um Cliente compra um ou vários Produtos.

## 📈 DER – Diagrama Entidade-Relacionamento

DER (Diagrama Entidade-Relacionamento) é a representação gráfica do MER. Ou seja, é o desenho que mostra visualmente as entidades, relacionamentos, atributos e cardinalidades.

É usado para documentar e comunicar a estrutura dos dados entre analistas, desenvolvedores e stakeholders.

Serve como base para transformar o modelo conceitual em modelo lógico e físico, que são implementados no banco de dados.

### 🔄 Diferença entre MER e DER

| Termo | Significado | Papel |
|-------|-------------|-------|
| MER | Modelo Entidade-Relacionamento | É o modelo conceitual (ideia, conceito) |
| DER | Diagrama Entidade-Relacionamento | É a representação gráfica (o desenho) do MER |

## 🛠️ Ferramentas para Diagramas

- 🌐 site Creately.com para criar os diagramas!
- 💻 app.quickdatabasediagrams.com para fazer diagramas com base no código sql!

## ☁️ Banco de Dados na Nuvem

banco de dados na nuvem que será usado nas aulas da dio -> clients.cloudclusters.io <- não é gratuito (apenas 7 dias)

https://accounts.cloudclusters.io/login/?next=https%3A%2F%2Fclients.cloudclusters.io%2F

## 💬 Comentários

Comente seus dbs!

## 📋 Tabela de exemplo da dio

```sql
CREATE TABLE usuarios(
    id INT,
    nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuario',
    email VARCHAR(100) NOT NULL UNIQUE COMMENT 'Email do usuario',
    endereco VARCHAR(50) NOT NULL COMMENT 'Endereço do usuario',
    data_nascimento DATE NOT NULL COMMENT 'Data de nascimento do usuario');

CREATE TABLE viagens.destinos -- // db viagens tabela destinos = viagens.destinos// (
    id INT,
    nome VARCHAR(255) NOT NULL UNIQUE COMMENT 'Nome do destino',
    descricao VARCHAR(255) NOT NULL COMMENT 'Descrição do destino'
);

CREATE TABLE viagens.reservas (
    id INT COMMENT 'Identificador único da reserva',
    id_usuario INT COMMENT 'Referência ao ID do usuário que fez a reserva',
    id_destino INT COMMENT 'Referência ao ID do destino da reserva',
    data DATE COMMENT 'Data da reserva',
    status VARCHAR(255) DEFAULT 'pendente' COMMENT 'Status da reserva (confirmada, pendente, cancelada, etc.)'
);
```

### 💡 Macete pra copiar dados

```sql
INSERT INTO usuarios_nova (id, nome, email, endereco, data_nascimento)
SELECT id, nome, email, endereco, data_nascimento
FROM usuarios;
```

## 🔧 Normalização de Dados

A normalização de dados é o processo de organizar os dados em um banco de dados para:

- Evitar redundâncias
- Garantir integridade dos dados  
- Facilitar a manutenção

Ela é feita em etapas chamadas formas normais (FN). Cada etapa elimina certos problemas. Aqui vai um resumo das principais:

### 🔹 1ª Forma Normal (1FN)

**Regras:** Eliminar atributos multivalorados (nada de listas ou tabelas dentro de colunas).

**Objetivo:** Cada campo deve conter um único valor atômico.

✅ Tabela com colunas bem definidas e dados simples.

### 🔹 2ª Forma Normal (2FN)

**Regras:** Estar na 1FN e eliminar dependências parciais (colunas que dependem só de parte da chave primária composta).

**Objetivo:** Todos os atributos devem depender da chave primária inteira.

✅ Evita repetição de informações parciais.

### 🔹 3ª Forma Normal (3FN)

**Regras:** Estar na 2FN e eliminar dependências transitivas (atributos que dependem de outro atributo que não é chave).

**Objetivo:** Todos os atributos devem depender somente da chave primária.

✅ Remove colunas que não são essenciais para identificar uma linha.

### 📝 Exemplo rápido:

Uma tabela de pedidos com:
- cliente_nome, cliente_email, produto_nome, quantidade

**❌ Problemas:**
- Dados do cliente se repetem em cada pedido.
- Nome do produto também.

**✅ Solução com normalização:**
- Tabela clientes
- Tabela produtos  
- Tabela pedidos com referências (chaves estrangeiras)

# 🔄 Bancos de dados não relacionais

As diferenças entre bancos de dados relacionais (SQL) e não relacionais (NoSQL) estão ligadas à forma como os dados são armazenados, estruturados e consultados. Abaixo está um resumo claro e direto:

## 📘 Bancos de Dados Relacionais (SQL)

✅ Estrutura fixa (tabelas) com linhas e colunas

✅ Esquema rígido: exige definição prévia dos campos (tipos, restrições, etc.)

✅ Usa SQL (Structured Query Language) para consultas

✅ Ideal para dados altamente estruturados e com relacionamentos complexos

✅ Transações ACID (Atomicidade, Consistência, Isolamento, Durabilidade)

**Exemplos:** MySQL, PostgreSQL, Oracle, SQL Server

## 📙 Bancos de Dados Não Relacionais (NoSQL)

✅ Estrutura flexível, podendo usar:

- **Documentos** (JSON, BSON) – ex: MongoDB
- **Chave-valor** – ex: Redis
- **Grafos** – ex: Neo4j
- **Colunar** – ex: Cassandra

✅ Sem esquema fixo (schema-less) — cada registro pode ter campos diferentes

✅ Projetado para alta escalabilidade e grandes volumes de dados (Big Data)

✅ Prioriza disponibilidade e performance sobre transações rígidas

✅ Melhor para dados semiestruturados ou desestruturados

**Exemplos:** MongoDB, Cassandra, Redis, CouchDB, Neo4j

## 📊 Comparação SQL vs NoSQL

| Característica           | SQL (Relacional)         | NoSQL (Não Relacional)                       |
| ------------------------ | ------------------------ | -------------------------------------------- |
| Estrutura                | Tabelas (linhas/colunas) | Documentos, grafos, etc.                     |
| Esquema                  | Fixo                     | Flexível ou inexistente                      |
| Linguagem de consulta    | SQL                      | Depende do banco (ex: MongoDB usa JSON-like) |
| Escalabilidade           | Vertical (mais hardware) | Horizontal (mais servidores)                 |
| Relacionamentos          | Fortemente suportados    | Limitados ou inexistentes                    |
| Performance com Big Data | Limitada                 | Otimizada                                    |
| Transações ACID          | Sim                      | Parcial ou eventual                          |

## ✅ O que é um Banco de Dados NoSQL?

NoSQL significa "Not Only SQL" e representa uma categoria de bancos de dados que não seguem o modelo relacional tradicional. Eles foram criados para lidar com grandes volumes de dados, alta escalabilidade e estrutura de dados flexível, especialmente em aplicações modernas como redes sociais, sistemas de recomendação, e análise de big data.

## 🧩 Principais características do NoSQL:

**🔓 Sem esquema fixo (schema-less):** os dados podem ter formatos variados, como JSON, sem precisar de uma estrutura pré-definida.

**📈 Alta escalabilidade:** facilitam o crescimento horizontal (adicionar mais servidores).

**⚡ Alto desempenho:** ótimos para leitura e escrita rápida de grandes quantidades de dados.

**🔄 Flexibilidade:** ótimo para dados não estruturados ou semiestruturados (ex: logs, posts, sensores).

**⏱️ Eventual consistency:** prioriza disponibilidade e desempenho, podendo abrir mão da consistência imediata (em oposição ao modelo ACID dos bancos relacionais).

## 📚 Tipos de Bancos NoSQL

### 📄 Baseado em Documentos
- Armazenam dados em formato tipo JSON/BSON.
- **Exemplo:** MongoDB, CouchDB
- **Ideal para:** Aplicações web, APIs, CMS

### 🔑 Chave-Valor
- Dados armazenados como pares chave : valor.
- **Exemplo:** Redis, Riak
- **Ideal para:** Caches, sessões, configuração

### 📊 Colunar
- Armazenam dados por colunas, otimizando leitura de grandes volumes.
- **Exemplo:** Cassandra, HBase
- **Ideal para:** Big Data, data warehouses

### 🕸️ Grafos
- Dados armazenados como nós e arestas, representando relações complexas.
- **Exemplo:** Neo4j, ArangoDB
- **Ideal para:** Redes sociais, sistemas de recomendação, mapas de rotas

## 📌 Quando usar NoSQL?

Use NoSQL quando:

- 🔄 Os dados mudam frequentemente ou têm estrutura variada.
- 📈 É preciso escalar para milhões de usuários ou registros.
- ⚡ Há necessidade de alta performance em leitura/escrita.
- 🚫 Não é essencial manter consistência rígida em transações.

# 🕸️ Guia Completo de Grafos e Neo4j

## 🧠 O que são Grafos?

Grafos são uma estrutura de dados formada por:

**🔵 Nódulos (nós):** representam entidades (ex: pessoas, cidades, produtos)

**➡️ Arestas (relacionamentos):** representam as ligações entre os nós (ex: amizade, distância, compra)

Cada nó e aresta pode ter propriedades (atributos).
Esse modelo é ideal para representar relações complexas e interconectadas.

### 📌 Exemplo de grafo:

Imagine um grafo com pessoas e amizades:

```
(Ana) ----[amiga]----> (João)
  |                       |
[amiga]                [amigo]
  |                       |
(Rafa) <---[amigo]---- (Carlos)
```

Esse tipo de estrutura é ideal para perguntas como:

- "Quem são os amigos em comum entre Ana e João?"
- "Qual o caminho mais curto entre duas pessoas?"
- "Quem influencia quem em uma rede social?"

## 🧰 O que é o Neo4j?

Neo4j é o banco de dados de grafos mais popular. Ele armazena dados como nós e relacionamentos diretamente, diferente dos bancos relacionais ou NoSQL documentais.

### 🔹 Características do Neo4j:

- **📊 Modelo de grafo nativo**
- **💬 Consultas com Cypher,** uma linguagem própria parecida com SQL
- **⚡ Alta performance** em consultas complexas de relacionamentos
- **🎯 Usado em** redes sociais, sistemas de recomendação, fraudes, rotas, etc.

### 💻 Exemplo de consulta em Cypher (Neo4j):

```cypher
MATCH (a:Pessoa {nome: "Ana"})-[:AMIGO]->(amigo)
RETURN amigo.nome
```

**Interpretação:** Retorna os nomes dos amigos de Ana.

### 🧩 Exemplo de modelagem:

**🔵 Entidades (nós):**
- `(:Pessoa {nome: "Ana"})`
- `(:Filme {titulo: "Matrix"})`

**➡️ Relacionamento (aresta):**
- `(Ana)-[:ASSISTIU]->(Matrix)`

## ✅ Quando usar grafos/Neo4j?

Use quando:

- 🔗 Há muitos relacionamentos entre os dados
- ⚡ Precisa de consultas rápidas em redes (ex: amigos de amigos, rotas, conexões)
- 🎯 Sistemas como: redes sociais, logística, IA, recomendação

## 🚀 Sandbox Neo4j

Vamos usar o sandboxneo4j.com para aprender grafos!

https://sandbox.neo4j.com

## 🛠️ Comandos Básicos do Neo4j

### 📝 Comando de criação de nós e relacionamentos

```cypher
CREATE
  (c1:Client {name: "Fulano", hobbies: ["Caça patos"]}),
  (c2:Client {name: "Beltrano", hobbies: ["Pescaria", "Futebol"]}),
  (c3:Client {name: "Ciclano", hobbies: ["Leitura", "Xadrez"]}),
  (c1)-[:AMIGO_DE]->(c2),
  (c2)-[:AMIGO_DE]->(c3),
  (c3)-[:AMIGO_DE]->(c1)
```

**💡 Note que não há estrutura fixa para criação dos Clients que definimos!**

### 📋 Comando de retorno de todos (get *)

```cypher
MATCH (todos) RETURN todos;
```

## 📚 Comandos Cypher Detalhados

### 🔵 1. CRIAR NÓS (ENTIDADES)

```cypher
CREATE (:Pessoa {nome: "Ana", idade: 30})
CREATE (:Filme {titulo: "Matrix", ano: 1999})
```

### 🔁 2. CRIAR RELACIONAMENTOS

```cypher
MATCH (p:Pessoa {nome: "Ana"}), (f:Filme {titulo: "Matrix"})
CREATE (p)-[:ASSISTIU {avaliacao: 5}]->(f)
```

- `:ASSISTIU` é o tipo do relacionamento
- `{avaliacao: 5}` são propriedades do relacionamento

### 🔍 3. CONSULTAR RELACIONAMENTOS

```cypher
MATCH (p:Pessoa)-[:ASSISTIU]->(f:Filme)
RETURN p.nome, f.titulo
```

### 🔁 4. CONSULTAR COM FILTROS

```cypher
MATCH (p:Pessoa)-[r:ASSISTIU]->(f:Filme)
WHERE r.avaliacao >= 4
RETURN p.nome, f.titulo, r.avaliacao
```

### 🕵️‍♂️ 5. ENCONTRAR CAMINHOS

```cypher
MATCH (a:Pessoa {nome: "Ana"})-[:AMIGO*1..2]-(amigo)
RETURN amigo
```

- `*1..2` → encontra amigos em até 2 níveis de conexão

### ✏️ 6. EDITAR (UPDATE) NÓS E RELAÇÕES

```cypher
MATCH (p:Pessoa {nome: "Ana"})
SET p.idade = 31
```

```cypher
MATCH (:Pessoa {nome: "Ana"})-[r:ASSISTIU]->(:Filme {titulo: "Matrix"})
SET r.avaliacao = 4
```

### 🧽 7. REMOVER DADOS

**Deletar um relacionamento:**
```cypher
MATCH (:Pessoa {nome: "Ana"})-[r:ASSISTIU]->(:Filme {titulo: "Matrix"})
DELETE r
```

**Deletar um nó (sem relacionamentos):**
```cypher
MATCH (p:Pessoa {nome: "Ana"})
DELETE p
```

**Forçar deletar um nó com relacionamentos:**
```cypher
MATCH (p:Pessoa {nome: "Ana"})
DETACH DELETE p
```

### 🧮 8. CONTAR E AGRUPAR

```cypher
MATCH (:Pessoa)-[:ASSISTIU]->(f:Filme)
RETURN f.titulo, COUNT(*) AS total_assistido
```

### 🌐 9. IMPORTANTE: TIPAGEM

- `:Label` → define o tipo do nó (`:Pessoa`, `:Filme`)
- `[RELACIONAMENTO]` → define a relação entre dois nós
- **Propriedades** → chave-valor em `{ }`

### 🔄 10. CRIAR TUDO DE UMA VEZ

```cypher
CREATE (a:Pessoa {nome: "Carlos"})-[:AMIGO]->(b:Pessoa {nome: "Bruno"})
```

# 🗄️ Guia Apache Cassandra e Redis

## 📊 O que é o Apache Cassandra?

Cassandra é um banco de dados NoSQL distribuído e orientado a colunas, criado pelo Facebook e depois aberto para a comunidade Apache.

Ele é feito para escalar horizontalmente e lidar com grandes volumes de dados com alta disponibilidade, mesmo com falhas de nós no cluster.

### 🔑 Principais características do Cassandra:

📦 Modelo colunar (como se fossem tabelas com colunas dinâmicas)

🧱 Alta escalabilidade horizontal (basta adicionar nós)

⚙️ Alta disponibilidade e tolerância a falhas

🛡️ Sem ponto único de falha

🧮 Baseado no modelo de chave primária + colunas

🚀 Ideal para aplicações com escrita intensa e grandes volumes de dados

### 📚 Terminologia básica

| Conceito          | Explicação                                  |
| ----------------- | ------------------------------------------- |
| **Cluster**       | Conjunto de nós Cassandra                   |
| **Node**          | Um servidor do cluster                      |
| **Keyspace**      | Equivale a um banco de dados                |
| **Table**         | Conjunto de registros (linhas e colunas)    |
| **Row**           | Registro com chave primária                 |
| **Partition Key** | Chave usada para distribuir dados entre nós |
| **CQL**           | Cassandra Query Language (semelhante a SQL) |

## 🎯 TUTORIALZÃO: comandos em CQL (Cassandra Query Language)

### ✅ 1. Criar um Keyspace

```cql
CREATE KEYSPACE minha_app
WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};
```

- **SimpleStrategy:** uso local (desenvolvimento)
- **replication_factor:** número de cópias dos dados

### ✅ 2. Usar o Keyspace

```cql
USE minha_app;
```

### ✅ 3. Criar uma Tabela

```cql
CREATE TABLE usuarios (
  id UUID PRIMARY KEY,
  nome TEXT,
  email TEXT,
  idade INT
);
```

- **PRIMARY KEY:** obrigatório; define a chave de partição e ordenação.

### ✅ 4. Inserir dados

```cql
INSERT INTO usuarios (id, nome, email, idade)
VALUES (uuid(), 'Ana', 'ana@email.com', 25);
```

### ✅ 5. Buscar dados

```cql
SELECT * FROM usuarios;
```

### ✅ 6. Buscar por chave primária

```cql
SELECT * FROM usuarios WHERE id = 9f4c0b8b-40d6-4a3d-81a9-12ef3894f15a;
```

⚠️ Cassandra só permite WHERE com a chave primária ou índices criados.

### ✅ 7. Atualizar dados

```cql
UPDATE usuarios SET idade = 26 WHERE id = 9f4c0b8b-40d6-4a3d-81a9-12ef3894f15a;
```

### ✅ 8. Deletar dados

```cql
DELETE FROM usuarios WHERE id = 9f4c0b8b-40d6-4a3d-81a9-12ef3894f15a;
```

### ✅ 9. Criar índice secundário (para filtrar por outro campo)

```cql
CREATE INDEX ON usuarios (email);
```

### ✅ 10. Consultar com índice secundário

```cql
SELECT * FROM usuarios WHERE email = 'ana@email.com';
```

## 🧠 Quando usar Cassandra?

Use Cassandra quando você precisa de:

- 📈 Grande volume de dados distribuídos
- ⚡ Escritas rápidas e escaláveis
- 🔄 Alta disponibilidade mesmo com falhas
- ⏱️ Eventual consistency (consistência eventual)
- 🚀 Baixa latência

### 🚀 Extras:

📥 **Ferramenta para usar CQL:**
- **CLI:** cqlsh (instalado com Cassandra)
- **GUI:** DataStax Studio

---

## 🔥 O que é o Redis?

Redis (REmote DIctionary Server) é um banco de dados NoSQL em memória, extremamente rápido, usado como:

- 🗄️ Banco de dados chave-valor
- 💾 Cache
- 📬 Fila de mensagens (Pub/Sub)
- ⏱️ Armazenamento temporário

### 🔑 Características principais:

| Característica               | Explicação                                     |
| ---------------------------- | ---------------------------------------------- |
| 🔥 **Ultra rápido**          | Armazenado em memória RAM                      |
| ⚙️ **Estrutura chave-valor** | Trabalha com strings, listas, hashes, sets etc |
| 🧱 **Simples e leve**        | Ótimo para cache, contadores, sessões etc      |
| 🔁 **Persistência opcional** | Pode salvar dados em disco                     |
| 📦 **Suporta TTL**           | Expiração de chaves (ideal pra cache)          |

### 🐳 Instalação (via Docker — mais fácil)

```bash
docker run --name redis -p 6379:6379 -d redis
```

Depois disso, você pode acessar com:

```bash
docker exec -it redis redis-cli
```

## 📚 REDIS TUTORIALZÃO – COMANDOS ESSENCIAIS

### ✅ 1. Setar e obter valores (strings)

```redis
SET nome "Fulano"
GET nome
```

### ⏱️ 2. Setar com tempo de expiração

```redis
SET email "fulano@email.com" EX 60  # expira em 60 segundos
```

### ✅ 3. Trabalhar com contadores

```redis
INCR visitas
INCRBY visitas 10
DECR visitas
GET visitas
```

### ✅ 4. Listas (tipo pilha/fila)

```redis
LPUSH tarefas "Lavar roupa"
LPUSH tarefas "Estudar Redis"
RPUSH tarefas "Jogar bola"

LRANGE tarefas 0 -1  # Mostra tudo na lista
LPOP tarefas         # Remove do início
RPOP tarefas         # Remove do fim
```

### ✅ 5. Hashes (semelhante a objetos ou dicionários)

```redis
HSET usuario:1 nome "Ana" email "ana@email.com"
HGETALL usuario:1
HGET usuario:1 nome
```

### ✅ 6. Sets (conjuntos, sem repetição)

```redis
SADD amigos "João" "Maria" "Carlos"
SMEMBERS amigos
SISMEMBER amigos "João"
SREM amigos "Carlos"
```

### ✅ 7. Sorted Sets (com pontuação)

```redis
ZADD ranking 100 "João"
ZADD ranking 200 "Ana"
ZADD ranking 150 "Carlos"

ZRANGE ranking 0 -1 WITHSCORES   # ordem crescente
ZREVRANGE ranking 0 -1 WITHSCORES # ordem decrescente
```

### ✅ 8. Verificar existência e deletar chave

```redis
EXISTS nome
DEL nome
```

### ✅ 9. Tempo de vida (TTL)

```redis
TTL email
EXPIRE email 120
```

### ✅ 10. Pub/Sub (mensageria)

**Terminal 1 – assinando canal:**

```redis
SUBSCRIBE noticias
```

**Terminal 2 – publicando:**

```redis
PUBLISH noticias "Nova notícia publicada!"
```

### 🔥 Exemplo de modelagem Redis para usuários

```redis
# Criar usuário com ID 1
HSET user:1 name "Bruno" email "bruno@ex.com"
SADD user:1:hobbies "Futebol" "Filmes"
```

## ✅ Quando usar Redis?

- 💾 Cache de páginas, sessões ou tokens
- 📊 Contadores em tempo real (views, likes)
- 📋 Armazenar filas ou tarefas
- 🏆 Ranking de jogadores, pontuações
- 💬 Sistema de chat ou notificação com Pub/Sub

# 🧠 O que é o MongoDB?

MongoDB é um banco de dados NoSQL orientado a documentos, que armazena dados no formato JSON (na prática, BSON).

Em vez de tabelas e linhas como bancos relacionais, o MongoDB usa:
- **Coleções** (equivalente a tabelas)
- **Documentos** (equivalente a registros)

## 🔑 Principais características:

| Recurso                         | Explicação                                      |
| ------------------------------- | ----------------------------------------------- |
| 📄 **Documentos JSON-like**     | Estrutura flexível, sem esquema fixo            |
| 🚀 **Escalável e performático** | Escalabilidade horizontal com sharding          |
| 📂 **Coleções**                 | Conjuntos de documentos                         |
| 🔎 **Consultas poderosas**      | Com filtros, projeções e agregações             |
| 📌 **Índices**                  | Suporte a índices, texto completo, geoespaciais |
| 🔐 **Alta disponibilidade**     | Suporte a replicação (replica sets)             |

---

# 🛠️ Como usar o MongoDB

## 📦 Instalar (via Docker)

```bash
docker run -d -p 27017:27017 --name mongo mongo
```

Acesse com MongoDB Compass (GUI) ou pela CLI:

```bash
docker exec -it mongo mongosh
```

---

# 📚 TUTORIALZÃO – Comandos MongoDB (via mongosh)

## ✅ 1. Criar banco e coleção

```javascript
use minha_app   // cria ou seleciona o banco
db.createCollection("usuarios")  // opcional; é criado automaticamente ao inserir
```

## ✅ 2. Inserir documentos

```javascript
db.usuarios.insertOne({
  nome: "Fulano",
  email: "fulano@email.com",
  idade: 30,
  hobbies: ["ler", "correr"]
})

db.usuarios.insertMany([
  { nome: "Beltrano", idade: 25 },
  { nome: "Ciclano", idade: 40 }
])
```

## ✅ 3. Buscar documentos

```javascript
db.usuarios.find()               // todos
db.usuarios.find({ idade: 30 })  // filtrado
db.usuarios.findOne({ nome: "Fulano" })
```

## ✅ 4. Atualizar documentos

```javascript
db.usuarios.updateOne(
  { nome: "Fulano" },
  { $set: { idade: 31 } }
)
```

## ✅ 5. Deletar documentos

```javascript
db.usuarios.deleteOne({ nome: "Fulano" })
db.usuarios.deleteMany({ idade: { $lt: 30 } })
```

## ✅ 6. Projeção (mostrar campos específicos)

```javascript
db.usuarios.find({}, { nome: 1, _id: 0 })
```

## ✅ 7. Filtros avançados

```javascript
db.usuarios.find({ idade: { $gt: 25 } })           // idade maior que 25
db.usuarios.find({ hobbies: { $in: ["correr"] } }) // se contém hobby
```

## ✅ 8. Índices

```javascript
db.usuarios.createIndex({ email: 1 })
```

## ✅ 9. Ordenar e limitar

```javascript
db.usuarios.find().sort({ idade: -1 }).limit(5)
```

## ✅ 10. Agregações (ex: média de idade)

```javascript
db.usuarios.aggregate([
  { $group: { _id: null, media: { $avg: "$idade" } } }
])
```

---

# 🔁 Modelagem Exemplo

```javascript
db.pedidos.insertOne({
  cliente: {
    nome: "João",
    email: "joao@email.com"
  },
  itens: [
    { produto: "Teclado", preco: 100 },
    { produto: "Mouse", preco: 50 }
  ],
  data: new Date()
})
```

---

# 📌 Quando usar MongoDB?

**Use quando:**

- ✅ Precisa de estrutura flexível (sem esquema fixo)
- ✅ Precisa de velocidade de leitura/escrita
- ✅ Precisa lidar com documentos complexos (aninhados)
- ✅ Quer escalar facilmente com clusters
- ✅ Quando não há necessidade de relacionamentos/joins

---

# 🐳 O que é Docker?

Para instalar o MongoDB vamos usar o Docker:

Docker é uma plataforma que permite empacotar, distribuir e executar aplicações em ambientes isolados chamados **containers**. Esses containers incluem tudo o que a aplicação precisa para funcionar (código, bibliotecas, dependências), garantindo que ela rode da mesma forma em qualquer lugar, seja no seu computador, em um servidor ou na nuvem.

## 🔧 Principais conceitos:

- **📦 Imagem**: é como uma "fotografia" da aplicação com tudo que ela precisa. Pode ser usada para criar containers.

- **🏃 Container**: é uma instância em execução de uma imagem. É leve, rápido e isolado do sistema operacional.

- **📋 Dockerfile**: é um arquivo com instruções para criar uma imagem Docker.

- **🌐 Docker Hub**: é um repositório online onde você pode encontrar e compartilhar imagens Docker.

## ⭐ Vantagens:

- 🌍 Portabilidade entre ambientes
- 🔧 Redução de conflitos entre dependências
- ⚡ Facilidade na automação de testes e deploy

**Resumindo:** Docker facilita o desenvolvimento, a distribuição e a execução de aplicações de forma consistente, independente do ambiente.

# 🐳 Docker Compose - Guia Completo

## 📋 O que é Docker Compose?

**Docker Compose** é uma ferramenta que permite definir e gerenciar múltiplos containers Docker como um único serviço, usando um arquivo de configuração chamado `docker-compose.yml`.

## 🎯 Para que serve:

Quando sua aplicação depende de vários serviços (por exemplo, uma API, um banco de dados e um serviço de cache), o Docker Compose facilita a criação e a execução de todos eles juntos com um único comando.

## 💡 Exemplo de uso:

Um arquivo `docker-compose.yml` pode definir:

```yaml
version: '3'
services:
  web:
    image: minha-api
    ports:
      - "8080:8080"
  db:
    image: mysql:8
    environment:
      MYSQL_ROOT_PASSWORD: senha
```

## 🚀 Exemplo nosso criado:

```yaml
services:
  db:
    image: mongo
    container_name: db
    restart: always
    environment:
      MONGO_INITDB_ROOT_USERNAME: dio
      MONGO_INITDB_ROOT_PASSWORD: dio
    ports:
      - "27017:27017"
    volumes:
      - "C:/Users/Carlos/Desktop/Programação 2024 e Redes/DIO-Java-Bootcamp/dio/Aulas/MongoDB:/data/db"
```

## ⚡ Comandos principais:

- 🔼 **`docker-compose up`**: sobe todos os containers definidos
- 🔼 **`docker-compose up -d`**: não sei, mas usamos isso
- 🔽 **`docker-compose down`**: para e remove os containers
- 🔨 **`docker-compose build`**: constrói as imagens definidas no Dockerfile

## ✅ Vantagens:

- 🎛️ Facilidade na orquestração de múltiplos containers
- 📝 Configuração clara e reutilizável
- 🧪 Útil em ambientes de desenvolvimento e testes

## 📝 Resumo:

O Docker Compose automatiza e simplifica a execução de aplicações compostas por vários containers, tudo configurado em um único arquivo.

---

# 🍃 MongoDB - Ferramentas e Interface

## 🖥️ Interface Gráfica

**COMO TENHO QUE APRENDER VOU USAR O MongoDB Compass QUE POSSUI UMA INTERFACE GRÁFICA PRA REALIZAR AS OPERAÇÕES**

❌ **NÃO VOU USAR O Mongo Shell (mongosh) — Linha de comando!!!!**

### 🧭 MongoDB Compass
O compass também possui MONGOSH!

### 🤖 Robo 3T (Robomongo)
há também o **Robo 3T** (também conhecido como Robomongo), ele é uma excelente ferramenta GUI para visualizar e editar dados no MongoDB, especialmente leve e direto ao ponto.

---

# 🌐 Clusters MongoDB - Conceitos Completos

No MongoDB, o termo **cluster** pode ter dois significados principais: **clusters locais** (implementados diretamente por você) e **clusters gerenciados na nuvem** (MongoDB Atlas). Ambos são formas de organizar e escalar seu banco de dados, mas com propósitos e complexidades diferentes.

## 🏠 Clusters Locais — Replica Sets e Sharded Clusters

### 🔄 Replica Set: Alta Disponibilidade e Redundância

Um **Replica Set** é um grupo de servidores MongoDB que mantém cópias idênticas dos seus dados. O objetivo principal é garantir que seu banco de dados continue funcionando mesmo que um ou mais servidores fiquem indisponíveis. Em um replica set, há um servidor principal que recebe as operações de escrita, e servidores secundários que replicam esses dados e podem assumir automaticamente em caso de falha do principal.

#### ✨ Vantagens do Replica Set:

- 🛡️ **Tolerância a falhas** (alta disponibilidade)
- 💾 **Backup e manutenção** sem downtime
- ⚡ **Melhora de desempenho** em consultas de leitura, podendo distribuir leitura para réplicas secundárias

Replica sets são essenciais para sistemas críticos que não podem parar.

### 🔀 Sharded Cluster: Escalabilidade Horizontal para Grandes Volumes

Um **Sharded Cluster** divide os dados entre múltiplos servidores, chamados **shards**. Cada shard contém uma parte dos dados, e o cluster gerencia onde cada dado está armazenado. Isso permite que o MongoDB escale horizontalmente, suportando grandes volumes de dados e alta carga de leitura e escrita.

#### 🚀 Vantagens do Sharding:

- 📊 **Suporte a Big Data** e alta demanda
- ⚖️ **Distribuição de carga** entre vários servidores
- 📈 **Permite que sua aplicação cresça** sem perder performance

Sharding é usado quando o volume de dados ou o número de usuários cresce demais para um único servidor.

## ☁️ Clusters em Nuvem — MongoDB Atlas

O **MongoDB Atlas** é um serviço gerenciado que oferece clusters MongoDB na nuvem, rodando em provedores como AWS, Azure e Google Cloud. Ele facilita a criação, configuração e escalabilidade dos clusters, cuidando da infraestrutura para você.

### 🌟 Benefícios do Atlas:

- 🚀 **Deploy rápido e fácil** de clusters em nuvem
- 🔒 **Backups automáticos, segurança, monitoramento** e escalabilidade integrada
- 🆓 **Possibilidade de começar com um cluster gratuito** para testes e aprendizado
- 🎛️ **Interface amigável** para gerenciamento sem precisar lidar com servidores

## 🐳 E no seu caso, com Docker local?

Ao rodar o MongoDB em um container Docker simples, você está usando um **servidor standalone** — ou seja, um único nó, sem replica set nem sharding. Essa configuração é perfeita para desenvolvimento, aprendizado e aplicações simples, mas não tem tolerância a falhas nem escalabilidade.

## 🤔 Quando usar clusters de verdade?

- 🧪 **Pequenos projetos e testes locais**: MongoDB standalone (um nó só) é suficiente
- 🏢 **Sistemas em produção que exigem alta disponibilidade**: configure um Replica Set para garantir que o serviço não pare em caso de falha
- 📈 **Aplicações com grande volume de dados e alta demanda**: use Sharding para distribuir carga e dados entre vários servidores
- ☁️ **Quer praticidade e escalabilidade na nuvem**: utilize o MongoDB Atlas para ter clusters gerenciados sem precisar configurar servidores

## 📋 Resumo Final

**Clusters no MongoDB** são formas de organizar seu banco para que ele seja mais robusto e escalável. **Replica Sets** protegem contra falhas, **Sharded Clusters** ampliam a capacidade, e **clusters na nuvem** facilitam o gerenciamento.

Se você está começando, use o **MongoDB standalone local** (como você fez no Docker). Quando o projeto crescer, evolua para clusters para manter seu sistema estável e rápido.

---

# 📐 Schema Design no MongoDB – Conceitos e Boas Práticas

**MongoDB** é um banco de dados **NoSQL orientado a documentos**, o que significa que não exige um esquema fixo como bancos relacionais (SQL), mas isso não significa ausência de planejamento. Um **bom schema design** é essencial para garantir **performance, escalabilidade e manutenção** do sistema.

# MongoDB: Conceitos Fundamentais e Schema Design

## 🧠 Conceitos Fundamentais

### 1. Documento (Document)
- **Unidade básica de dados** no MongoDB
- Usa formato **BSON** (similar a JSON)
- Armazena dados de forma estruturada: `{ nome: "Carlos", idade: 30 }`

### 2. Coleção (Collection)
- Conjunto de documentos relacionados (como uma "tabela", mas sem esquema fixo)
- Documentos de uma mesma coleção podem ter estruturas diferentes — mas não é recomendado sem necessidade

### 3. Esquema flexível (Schema-less)
- MongoDB não exige um esquema fixo
- Mas você pode (e deve) definir um padrão lógico de estrutura dos documentos (manualmente ou usando validações)

## ✅ Boas Práticas de Schema Design

### 1. Modelar com base nos casos de uso
- Pense em **como os dados serão lidos e consultados**, não apenas em como são organizados
- Otimize para leitura, especialmente em aplicações web/mobile

**📌 Exemplo:**
- Se você sempre precisa do cliente com os pedidos juntos, considere **embutir** os pedidos (embed)
- Se os pedidos forem muitos ou acessados separadamente, use **referência** (reference)

### 2. Embed ou Referenciar?

| Estratégia | Embed (Incorporar) | Reference (Referência) |
|------------|-------------------|------------------------|
| **Quando usar** | Dados que sempre aparecem juntos | Dados grandes ou com reuso |
| **Exemplo** | Endereço do usuário | Produtos em pedidos |

**📍 Dica:**
- 99% dos acessos juntos → **embed**
- Muitos acessos separados / muitos dados → **reference**

### 3. Evite documentos gigantes
- MongoDB tem limite de **16 MB por documento**
- Divida dados em múltiplos documentos se necessário

### 4. Use índices corretamente
- Índices aceleram buscas, mas consomem memória
- Crie índices nos campos mais usados em:
  - `find()`
  - `sort()`
  - `join` (lookup)
  - `aggregate()`

### 5. Padronize nomes e estruturas
- Use nomes de campos claros e consistentes
- Use `camelCase` (ex: dataNascimento) ou `snake_case` (data_nascimento), mas seja consistente

### 6. Validação de esquema (opcional, mas recomendada)
Use validators para impor formato e obrigatoriedade de campos.

**Exemplo:**
```javascript
{
  $jsonSchema: {
    bsonType: "object",
    required: ["nome", "email"],
    properties: {
      nome: { bsonType: "string" },
      email: { bsonType: "string" },
      idade: { bsonType: "int" }
    }
  }
}
```

### 7. Evite aninhamento profundo
- Documentos muito aninhados dificultam leitura e indexação
- Limite o nível de profundidade (2 ou 3 níveis no máximo)

### 8. Projete com escalabilidade em mente
Pense em como os dados crescerão:
- Muitos comentários por post? Pode ser uma coleção separada
- Milhões de pedidos por cliente? Use reference

### 9. Documentação interna
Mesmo que MongoDB não obrigue um esquema, documente a estrutura dos dados (para equipes futuras e manutenção)

## 📌 Exemplos de Bom Design

### Exemplo: Usuário com endereço embutido
```javascript
{
  "nome": "Carlos",
  "email": "carlos@email.com",
  "endereco": {
    "rua": "Av. Brasil",
    "numero": 123,
    "cidade": "Rio de Janeiro"
  }
}
```

### Exemplo: Pedido referenciando produto
```javascript
{
  "clienteId": "123abc",
  "produtos": [
    { "produtoId": "prod1", "quantidade": 2 },
    { "produtoId": "prod2", "quantidade": 1 }
  ],
  "data": "2025-05-16"
}
```

## ❌ Erros Comuns
- Tratar MongoDB como se fosse relacional
- Inserir documentos desorganizados sem planejamento
- Usar embed com dados que crescem indefinidamente
- Não usar índices e reclamar de performance
- Misturar muito os tipos em uma mesma coleção

## ✅ Conclusão
O MongoDB oferece liberdade, mas exige responsabilidade. Um bom schema:
- Reflete seus casos de uso reais
- Equilibra entre embed e referência
- É projetado para performance, clareza e manutenção

---

## 📦 Diferença entre JSON e BSON

### ✅ O que é JSON?
**JSON** (JavaScript Object Notation) é um formato de texto leve, amplamente utilizado para troca de dados entre sistemas, especialmente em aplicações web.

**Características:**
- Formato de texto legível por humanos
- Baseado em pares chave-valor
- Suporta tipos como:
  - `string`
  - `number`
  - `boolean`
  - `array`
  - `object`
  - `null`

**Exemplo:**
```json
{
  "nome": "Carlos",
  "idade": 30,
  "ativo": true
}
```

### ✅ O que é BSON?
**BSON** (Binary JSON) é um formato binário derivado do JSON, criado pelo MongoDB para armazenar e transmitir dados de forma mais eficiente e com suporte a mais tipos.

**Características:**
- Formato binário (não legível por humanos)
- Mais eficiente para armazenamento e leitura em máquinas
- Suporta tipos extras que o JSON não tem, como:
  - `Date`
  - `ObjectId`
  - `BinData` (dados binários)
  - `int32`, `int64`, `decimal128`
- Usado internamente pelo MongoDB

**Exemplo equivalente** (conceitual, pois BSON é binário):
```javascript
{
  "nome": "Carlos",
  "idade": 30,
  "nascimento": ISODate("1995-05-01T00:00:00Z"),
  "_id": ObjectId("6645f12e99e3b4f3d1a2b456")
}
```


## 📊 Performance no MongoDB

### Conceitos Fundamentais
A performance no MongoDB está diretamente ligada à forma como os dados são consultados e armazenados. O principal recurso para otimizar consultas são os **índices**.

### O que são Índices?
Os índices funcionam como atalhos que o banco de dados usa para localizar documentos de forma mais rápida, evitando a necessidade de varrer toda a coleção. São especialmente úteis em campos frequentemente usados em:
- Filtros (`find`)
- Ordenações (`sort`)
- Buscas específicas

### Tipos de Índices

#### 1. Índice Padrão (Single Field)
- Aplicado em um único campo
- Mais simples e comum

#### 2. Índice Composto
- Aplicado em dois ou mais campos
- Útil para consultas que filtram múltiplos campos

#### 3. Índice Texto
- Usado para buscas por palavras em campos de texto
- Permite pesquisa textual avançada

#### 4. Índice Geoespacial
- Para dados de localização geográfica
- Suporte a consultas baseadas em coordenadas

### ⚠️ Impacto da Ausência de Índices
Sem índices adequados, as consultas podem ficar extremamente lentas, principalmente em coleções grandes, pois o banco precisa verificar documento por documento (**collection scan**).

**Regra de Ouro:** Criar os índices certos nos campos mais consultados é essencial para garantir boa performance.

---

## 🔄 Agregações no MongoDB

### Conceito Principal
As agregações são uma forma poderosa de processar dados e retornar resultados computados. Em vez de simplesmente buscar documentos como estão armazenados, permite executar uma série de operações para transformar e combinar dados.

**Analogia:** Pense como uma linha de montagem - os documentos entram, passam por várias estações (estágios), e um resultado transformado sai no final.

### Pipeline de Agregação

#### Características Principais:
- Abordagem mais comum e recomendada
- Consiste em uma sequência (array) de estágios
- Cada estágio processa documentos do anterior
- **A ordem dos estágios é crucial**

### Principais Estágios (Stages)

#### `$match`
- **Função:** Filtra documentos (similar ao `find()`)
- **Dica:** Coloque no início para reduzir volume de dados processados

#### `$group`
- **Função:** Agrupa documentos por chave especificada
- **Uso:** Permite aplicar acumuladores para cálculos
- **Importância:** Coração de muitas agregações

#### `$project`
- **Função:** Remodela documentos
- **Capacidades:**
  - Incluir/excluir campos
  - Adicionar campos computados
  - Renomear campos

#### `$sort`
- **Função:** Ordena documentos

#### `$limit` / `$skip`
- **`$limit`:** Limita número de documentos
- **`$skip`:** Pula documentos especificados

#### `$unwind`
- **Função:** Desconstrói arrays
- **Resultado:** Cria um documento para cada elemento do array

#### `$lookup`
- **Função:** Realiza "left outer join" com outra coleção
- **Limitação:** Apenas no mesmo banco de dados

#### `$out` / `$merge`
- **`$out`:** Escreve em nova coleção (substitui se existir)
- **`$merge`:** Atualiza/insere em coleção existente

### Operadores de Expressão

#### Acumuladores (usado com `$group`):
- **`$sum`:** Soma valores numéricos
- **`$avg`:** Calcula média
- **`$min`/`$max`:** Valores mínimo/máximo
- **`$push`:** Adiciona valor a array
- **`$addToSet`:** Adiciona apenas se não existir
- **`$first`/`$last`:** Primeiro/último valor do grupo

### Quando Usar Agregações?

1. **Cálculos complexos** sobre dados (somas, médias, contagens)
2. **Agrupamento de dados** para insights resumidos
3. **Transformação estrutural** para relatórios
4. **Junção de coleções** (com `$lookup`)
5. **Processamento server-side** para evitar transferência de grandes volumes

### Outras Formas de Agregação

#### MapReduce
- Paradigma mais antigo e flexível
- Mais complexo e geralmente mais lento
- Útil para cenários muito específicos

#### Comandos Simples
- `count()`, `distinct()`
- Convenientes para operações simples
- Implementados internamente via aggregation framework

---

## 🛠️ DBeaver - Ferramenta de Gerenciamento

### O que é o DBeaver?
O DBeaver é uma ferramenta gráfica (GUI) para gerenciar bancos de dados. É como um "Workbench mais poderoso e universal".

### Principais Funcionalidades

#### Conectividade Universal
Suporte a múltiplos SGBDs:
- MySQL
- PostgreSQL
- Oracle
- SQLite
- SQL Server
- MariaDB
- **MongoDB**
- E muitos outros

#### Recursos Principais
1. **Criação e edição** de tabelas e dados
2. **Execução de queries** com:
   - Destaque de sintaxe
   - Histórico de comandos
3. **Visualização de relações** entre tabelas (diagramas ER)
4. **Integração com Docker** - conecta facilmente a bancos em containers

### Vantagens para Desenvolvimento
- Interface intuitiva e unificada
- Suporte multiplataforma
- Excelente para ambientes containerizados
- Ferramenta completa para administração de banco

---

## 💡 Resumo de Boas Práticas

### Performance MongoDB:
1. **Sempre criar índices** nos campos mais consultados
2. **Usar agregações** para processamento complexo server-side
3. **Otimizar pipelines** colocando `$match` no início
4. **Monitorar collection scans** e evitá-los

### Agregações:
1. **Planejar a ordem** dos estágios cuidadosamente
2. **Filtrar cedo** no pipeline para reduzir dados processados
3. **Usar operadores apropriados** para cada necessidade
4. **Testar performance** com dados reais

### Ferramentas:
1. **DBeaver** para administração visual
2. **Índices** como base da performance
3. **Aggregation Pipeline** como ferramenta principal de análise



## 🆚 DBeaver vs MySQL Workbench

### Comparação de Funcionalidades

| Funcionalidade       | DBeaver    | MySQL Workbench |
| -------------------- | ---------- | --------------- |
| Multi-banco          | ✅ Sim      | ❌ Só MySQL      |
| Open Source          | ✅ Sim      | ✅ Sim           |
| Interface moderna    | ✅ Boa      | 🟡 Média        |
| Extensível (plugins) | ✅ Sim      | ❌ Não           |
| Leveza/performance   | 🟡 Mediana | ✅ Boa com MySQL |

### 🧪 Exemplo Prático: Conectando ao MySQL via Docker

Para conectar-se a um MySQL rodando no Docker usando o DBeaver:

1. **Abrir o DBeaver**
2. **Clicar em "New Database Connection"**
3. **Escolher MySQL**
4. **Configurar a conexão:**
   - **Host:** localhost
   - **Porta:** 3306
   - **Usuário:** root (ou o usuário configurado)
   - **Senha:** (a senha definida em `-e MYSQL_ROOT_PASSWORD`)
5. **Conectar**

E pronto! Você pode visualizar o banco sem precisar decorar comandos, montar CLI ou lidar com configuração complexa.

---

## ☁️ Introdução à Computação em Nuvem (AZ-900)

### O que é Computação em Nuvem?

A **Computação em Nuvem** é o fornecimento de serviços de computação através da internet ("a nuvem"), incluindo:

- Servidores
- Armazenamento
- Bancos de dados
- Redes
- Software
- Análise e inteligência

### Benefícios Principais

- **Inovações mais rápidas**
- **Recursos escaláveis sob demanda**
- **Economia de custos**
- **Eliminação da necessidade de datacenters físicos locais**

### Tecnologia Base: Virtualização

A computação em nuvem é viabilizada principalmente por **virtualização**, que permite que um único servidor físico simule múltiplas máquinas virtuais (VMs), otimizando recursos e aumentando flexibilidade.

---

## 🏗️ Modelos de Nuvem

### 🏢 1. Nuvem Privada (Private Cloud)

**Características:**
- Infraestrutura exclusiva para uma única organização
- Pode estar no datacenter da empresa ou hospedada por terceiros
- Maior controle e segurança
- Ideal para empresas com exigências rigorosas (bancos, governo)
- Sem acesso a usuários externos

**📌 Vantagens:**
- Segurança
- Personalização
- Conformidade

### ☁️ 2. Nuvem Pública (Public Cloud)

**Características:**
- Recursos fornecidos por terceiros (AWS, Azure, Google Cloud)
- Acesso via internet com conexão segura
- Compartilhada entre múltiplos clientes
- Exemplos: Google Drive, hospedagem na AWS

**📌 Vantagens:**
- Escalabilidade
- Baixo custo inicial
- Sem necessidade de gerenciar infraestrutura

### 🔁 3. Nuvem Híbrida (Hybrid Cloud)

**Características:**
- Combinação de nuvem pública e privada
- Permite mover dados e aplicações entre ambientes
- Equilíbrio entre segurança e escalabilidade

**📌 Exemplo:**
Manter dados sensíveis em nuvem privada e usar nuvem pública para testes ou picos de demanda.

### 🌐 4. Nuvem Comunitária (Community Cloud)

**Características:**
- Compartilhada por organizações com interesses comuns
- Pode ser gerenciada por uma ou mais organizações
- Exemplos: órgãos governamentais, hospitais

**📌 Vantagens:**
- Colaboração segura entre entidades
- Custo dividido
- Foco em necessidades específicas

---

## ☁️🔀 Multicloud

### O que é Multicloud?

Uso de **dois ou mais provedores de nuvem pública** diferentes simultaneamente.

**Exemplo:** AWS + Azure + Google Cloud

### 🟡 Importante: Multicloud ≠ Nuvem Híbrida

- **Multicloud:** Várias nuvens públicas diferentes
- **Híbrida:** Combinação de nuvem pública com nuvem privada

### ✅ Por que usar Multicloud?

1. **Evitar vendor lock-in** (dependência de um único fornecedor)
2. **Aproveitar o melhor de cada serviço**
3. **Alta disponibilidade e redundância**
4. **Custos otimizados**

### 📌 Exemplo Prático

Uma empresa pode:
- Hospedar seu site na **AWS**
- Usar banco de dados do **Azure**  
- Armazenar backups no **Google Cloud**

---

## 📊 Comparação Resumida dos Modelos

### Nuvem Pública
- **Vantagens:** Nenhuma despesa de capital para escalar, provisionamento rápido, paga apenas pelo que utiliza
- **Ideal para:** Startups, desenvolvimento, aplicações com demanda variável

### Nuvem Privada
- **Vantagens:** Controle total sobre recursos e segurança, responsabilidade pela manutenção
- **Ideal para:** Empresas com dados sensíveis, requisitos regulatórios

### Nuvem Híbrida
- **Vantagens:** Flexibilidade para escolher onde executar aplicações, controle de segurança e conformidade
- **Ideal para:** Empresas em transição, com workloads mistos

---

## 🎯 Dicas Importantes para AZ-900

- **AZ-900 é uma certificação de entrada** em cloud computing
- **Azure oferece serviços gratuitos e pagos**
- **Sempre exclua recursos** de laboratório para evitar cobranças
- **Foque nos conceitos fundamentais** antes de partir para certificações mais avançadas

---

*Este guia serve como base para estudos de ferramentas de banco de dados e conceitos fundamentais de computação em nuvem.*

# CAPEX (Capital Expenditure) 
é o gasto com bens de capital ou investimentos de longo prazo, como a compra de servidores, equipamentos ou construção de datacenters. Esses gastos costumam ter um valor inicial alto e são usados por vários anos, sendo registrados como ativos e depreciados com o tempo. Na era pré-nuvem, empresas tinham grandes despesas de CAPEX para montar suas próprias infraestruturas de TI. Com a computação em nuvem, muitos desses custos foram substituídos por OPEX, já que agora as empresas alugam recursos ao invés de comprá-los, o valor do Capex se reduz com o tempo, ao contrário do Opex onde o valor aumenta conforme a necessidade operacional.

# OPEX (Operational Expenditure) 
é o gasto operacional do dia a dia, como pagamento de serviços, assinaturas e manutenção. Na computação em nuvem, é o modelo onde a empresa paga pelo uso dos recursos (como servidores, armazenamento ou software) sem precisar comprá-los. É mais flexível, com custos menores no início e pagamento conforme o uso, sendo ideal para escalar rapidamente sem grandes investimentos iniciais.

# Modelo baseado em consumo 
é operado através dos provedores de serviços, onde os usuários finais pagam somente pelos recursos que utilizam, possui uma melhor previsão de custos com preços para recursos e serviços individuais, com cobrança baseada no seu uso real

# Jumpserver 
é uma plataforma open-source de bastion host (ou "jump host") usada para gerenciar o acesso remoto seguro a servidores e dispositivos de rede. Ele atua como um ponto intermediário entre os usuários e os servidores de destino, controlando, monitorando e registrando todas as conexões SSH, RDP, etc. É muito usado para reforçar a segurança de ambientes de TI, permitindo auditoria de acessos e evitando conexões diretas aos servidores críticos.

## Lab Azure

**Evite usar recursos 'Versão prévia'** uma vez que eles podem ser 'instáveis' e isso na produção é caótico!

# Beneficios da computação em nuvem

## Alta Disponibilidade

alta disponibilidade que se concentra em garantir a disponibilidade máxima, independentemente de interrupções ou eventos que possam ocorrer - Sempre funcionando, acesso de múltiplos locais, recursos sempre disponíveis
 
## 📈 SLA da Azure – Resumo
SLA (Service Level Agreement) é o acordo de nível de serviço oferecido pela Microsoft Azure que garante uma disponibilidade mínima dos serviços de nuvem.

### ⏱ Exemplos comuns de SLA na Azure:

| SLA  | Tempo máximo de indisponibilidade (mensal) |
|------|------------------------------------------|
| 99%  | 7h 12min                                 |
| 99,9% | 43min                                   |
| 99,95% | 21,6min                                |
| 99,99% | 4,32min                                |

Quanto maior o SLA, menor o tempo que o serviço pode ficar fora do ar no mês.

### ⚠️ Importante:
O SLA varia conforme o serviço e a arquitetura. Por exemplo, uma VM sozinha pode ter 99,9%, mas com redundância (conjunto de disponibilidade) sobe para 99,95% ou mais.

Para alcançar alta disponibilidade, é preciso configurar corretamente zonas de disponibilidade, balanceamento de carga, backups, etc.

O site oficial da Microsoft Azure para verificar o status dos serviços em tempo real é:

🔗 [https://status.azure.com](https://status.azure.com)

### ✅ O que você encontra lá:
- Disponibilidade global dos serviços da Azure.
- Incidentes ou interrupções em regiões específicas.
- Histórico de eventos passados.
- Informações por produto e região.

**Dica:** Para ambientes críticos, é bom monitorar esse site regularmente ou configurar alertas por e-mail.

## 📊 Escalabilidade
Escalabilidade é a capacidade de aumentar ou reduzir recursos computacionais para atender à demanda de uma aplicação ou serviço.

Quando a necessidade de processamento, armazenamento ou tráfego cresce, o sistema pode escalar para cima (scale-up) ou escalar para fora (scale-out) automaticamente ou sob demanda.

Da mesma forma, se a demanda cair, os recursos podem ser reduzidos, ajudando a otimizar os custos.

## 📌 Principais pontos:

- Permite crescimento eficiente conforme o negócio exige.
- Reduz custos ao evitar superdimensionamento.
- Você paga apenas pelo que realmente usa.

### ⚠️ Escalabilidade e elasticidade são conceitos parecidos, mas:

- **Escalabilidade**: capacidade de ajustar recursos conforme necessário.
- **Elasticidade**: capacidade de ajustar recursos automaticamente e rapidamente conforme as variações de carga.

## 📈 Elasticidade

Elasticidade é a capacidade da nuvem de aumentar ou reduzir automaticamente os recursos computacionais conforme a demanda.

Um exemplo clássico é durante a Black Friday, onde um site pode receber muito mais acessos do que o normal. Nesse cenário:

- A nuvem expande os recursos automaticamente (como instâncias de servidor, largura de banda, etc.) para atender ao pico de demanda.
- Após o evento, com a queda no tráfego, os recursos são reduzidos automaticamente, evitando desperdício.

### 📌 Benefícios:

- Alta performance sob demanda.
- Economia de custos (você só paga pelo que precisa no momento).
- Escalabilidade inteligente, sem intervenção manual.

## ✅ Confiabilidade

Confiabilidade é a capacidade de um sistema ou serviço em nuvem de funcionar de forma consistente e contínua, mesmo diante de falhas, picos de demanda ou problemas técnicos, o design descentralizado da nuvem a torna confiável e resiliente.

Um serviço confiável:

- Minimiza o tempo de inatividade (downtime).
- Garante disponibilidade alta (geralmente com SLA de 99,9% ou mais).
- Possui redundância e recuperação de desastres integradas.
- É monitorado continuamente para detectar e corrigir falhas automaticamente.

### 📌 Como a nuvem garante confiabilidade:

- Replicação de dados em múltiplas zonas ou regiões.
- Balanceamento de carga.
- Backups automáticos.
- Failover (redirecionamento automático em caso de falha).

A confiabilidade é essencial para garantir que aplicações críticas continuem funcionando sem interrupções, mesmo em situações adversas.

## 📏 Previsibilidade

Previsibilidade na computação em nuvem se refere à capacidade de estimar custos, desempenho e comportamento dos recursos de forma antecipada e controlada, esses aspectos são influenciados pelo Microsoft Azure Well-Architected Framework.

Com a nuvem, é possível:

- Ter previsão de custos, já que os serviços seguem modelos baseados em consumo (pay-as-you-go).
- Estimar o desempenho esperado com base em SLAs e especificações técnicas.
- Planejar capacidades futuras com mais segurança.

### 📌 Benefícios da previsibilidade:

- Controle financeiro: fácil monitorar gastos e evitar surpresas na fatura.
- Planejamento estratégico: ajuda a dimensionar infraestrutura de forma mais eficaz.
- Estabilidade operacional: evita picos ou quedas inesperadas de desempenho.

Muitos provedores, como a Azure, oferecem calculadoras de custo e ferramentas de monitoramento que ajudam a manter a previsibilidade dos recursos e dos investimentos.

## 🔐 Segurança

Segurança na computação em nuvem envolve o conjunto de práticas, tecnologias e políticas usadas para proteger dados, aplicações e infraestrutura contra acessos não autorizados, vazamentos e ataques cibernéticos.

Os provedores de nuvem (como Azure, AWS e Google Cloud) implementam camadas robustas de segurança para garantir a proteção dos dados dos clientes, incluindo:

- Criptografia de dados em trânsito e em repouso.
- Controle de acesso com autenticação multifator (MFA) e identidade baseada em função (RBAC).
- Firewalls e redes virtuais seguras.
- Monitoramento contínuo e alertas contra atividades suspeitas.
- Backups e recuperação de desastres.

### 📌 Responsabilidade compartilhada:

- O provedor é responsável pela **segurança da nuvem** (infraestrutura).
- O cliente é responsável pela **segurança na nuvem** (dados, acessos, configurações).

A segurança é um dos pilares mais importantes da nuvem e precisa ser considerada desde o planejamento até a operação dos serviços, e a implementação das configurações de segurança por parte dos clientes devem ser feitas de forma correta!

> Se você quiser o controle máximo da segurança, a infraestrutura como serviço irá fornecer os recursos físicos, mas permitirá que você gerencie os sistemas operacionais e o software instalado, incluindo aplicação de patches e manutenção.

## 🛡️ O que são Apólices no Azure (Azure Policy)

### 📌 Definição:
Azure Policy é um serviço que permite criar, atribuir e gerenciar regras (políticas) que forçam padrões ou restrições nos recursos do Azure. Isso ajuda a impedir configurações incorretas e a manter conformidade com normas internas ou externas.

### ✅ Exemplos de uso:
- **Restringir regiões**: impedir a criação de recursos fora de uma região específica (por exemplo, só permitir "Brazil South").
- **Obrigar tags**: exigir que todo recurso criado tenha tags como projeto, ambiente, ou owner.
- **Controlar tipos de VMs**: permitir apenas determinados tamanhos ou famílias de máquinas virtuais.
- **Enforçar criptografia**: garantir que discos estejam sempre criptografados.

### 🔄 Como funciona:
1. Você cria ou usa uma política pronta (Azure oferece várias built-in).
2. Atribui essa política a um escopo (assinatura, grupo de recursos, etc).
3. O Azure aplica e monitora automaticamente se os recursos estão em conformidade.
4. Se algo estiver fora da regra, pode bloquear a ação ou apenas alertar (modo de auditoria).

### 🧩 Tipos de ações:
- **Deny** (negar criação/alteração)
- **Audit** (somente registrar violação)
- **Append** (adicionar propriedades a um recurso)
- **DeployIfNotExists** (implantar algo automaticamente se faltar)

### 🧠 Importância:
Azure Policy é fundamental para:
- Governança e segurança
- Conformidade com normas (LGPD, ISO, etc)
- Controle de custos
- Padronização de ambientes

## 🏛️ Governança na Nuvem

Governança é o conjunto de processos, regras, políticas e ferramentas que ajudam a organizar, controlar e padronizar o uso da nuvem dentro de uma organização.

- A auditoria baseada em nuvem ajuda a sinalizar qualquer recurso que esteja fora da conformidade com seus padrões corporativos e fornece estratégias de mitigação
- Dependendo do seu modelo operacional, patches de software e atualizações também podem ser aplicados automaticamente, o que ajuda na governança e na segurança
- Ao estabelecer uma presença de governança o mais cedo possível, você poderá manter sua presença de nuvem atualizada, protegida e bem gerenciada
- Ela garante que os recursos sejam utilizados de forma segura, eficiente, conforme as normas e com controle de custos.

### 🎯 Objetivos da governança:
- Evitar desperdícios e uso indevido de recursos.
- Manter conformidade com requisitos legais e regulatórios.
- Padronizar configurações e boas práticas.
- Proteger dados sensíveis e controlar acessos.
- Monitorar o ambiente em tempo real.

### 🛠️ Ferramentas e práticas de governança no Azure:

| Recurso                                          | Função                                                                   |
|--------------------------------------------------|--------------------------------------------------------------------------|
| **Azure Policy**                                 | Define e aplica regras de conformidade automaticamente.                  |
| **Management Groups**                            | Organiza assinaturas em uma hierarquia para aplicar políticas em escala. |
| **Resource Locks**                               | Impede a exclusão ou modificação acidental de recursos críticos.         |
| **Tags**                                         | Ajudam a classificar e rastrear recursos (ex: por projeto ou ambiente).  |
| **Azure Blueprints**                             | Agrupamento de políticas, RBAC, e recursos para padronizar ambientes.    |
| **RBAC (Controle de Acesso Baseado em Funções)** | Controla quem pode fazer o quê com quais recursos.                       |

### 📌 Exemplo prático:
Você pode criar uma política para garantir que:
- Todos os recursos estejam em uma região específica.
- Todo recurso tenha uma tag com o nome do projeto.
- Apenas VMs aprovadas possam ser criadas.

## 🧩 Gerenciabilidade

Gerenciabilidade na computação em nuvem refere-se à capacidade de monitorar, controlar, configurar e otimizar os recursos e serviços de forma eficiente e centralizada.

Ela permite que administradores e equipes de TI tenham visibilidade e controle total do ambiente em nuvem, garantindo que tudo funcione corretamente, com segurança e dentro dos padrões definidos.

> Um dos principais benefícios da computação em nuvem são as opções de capacidade de gerenciamento, há dois tipos de capacidade de gerenciamento para a computação em nuvem que aprenderemos, e ambos trazem excelentes benefícios.

**Gerenciamento da nuvem** diz respeito a gerenciar os seus recursos, por exemplo:
- Escalar automaticamente a implantação de recursos com base nas necessidades
- Implantar recursos com base em um modelo pré-configurado, removendo as necessidades de configurações manuais
- Isso pode ser feito usando também APIs e PowerShell além é claro do portal da Azure!

### 🎯 Objetivos da gerenciabilidade:
- Monitoramento contínuo de desempenho, disponibilidade e segurança.
- Automação de tarefas administrativas (provisionamento, escalonamento, alertas).
- Auditoria e rastreamento de atividades dos usuários.
- Organização e categorização de recursos (como via tags).
- Facilidade na tomada de decisões, com base em dados e relatórios.

### 🛠️ Ferramentas de Gerenciabilidade no Azure:

| Recurso                   | Função                                                                  |
|---------------------------|-------------------------------------------------------------------------|
| **Azure Monitor**         | Coleta métricas, logs e eventos para monitoramento em tempo real.       |
| **Azure Log Analytics**   | Analisa logs e fornece insights detalhados sobre o ambiente.            |
| **Azure Advisor**         | Sugestões de boas práticas para melhorar desempenho, segurança e custo. |
| **Azure Cost Management** | Monitoramento e controle de gastos e orçamentos.                        |
| **Azure Automation**      | Automação de tarefas repetitivas (como desligar VMs fora do horário).   |

### 📌 Benefícios:
- Visibilidade total do ambiente.
- Redução de falhas com alertas e automações.
- Maior eficiência operacional.
- Suporte à governança e conformidade.

## Tipos de Serviço de Nuvem

Na Microsoft Azure, os modelos de computação em nuvem IaaS, PaaS e SaaS são oferecidos com diversas soluções específicas. Abaixo está uma explicação simples de cada modelo com exemplos práticos da plataforma:

🔹 IaaS (Infrastructure as a Service)  
Definição:  
Você aluga infraestrutura de TI — servidores, redes, sistemas operacionais, armazenamento — em vez de comprá-la e mantê-la.

Responsabilidade do cliente:  
Você gerencia o sistema operacional, as aplicações, os dados e as configurações. A Azure gerencia o hardware e a infraestrutura básica.

Exemplos na Azure:  

Azure Virtual Machines (VMs): máquinas virtuais que você pode configurar com o sistema operacional e softwares desejados.

Azure Virtual Network: permite configurar redes privadas.

Azure Load Balancer, Azure Storage: armazenamento e balanceamento de carga.

Caso de uso:  
Hospedar sistemas legados, ambientes de teste, servidores personalizados, controle total do sistema operacional.

🔹 PaaS (Platform as a Service)  
Definição:  
Fornece uma plataforma gerenciada para que você desenvolva, execute e gerencie aplicações sem se preocupar com a infraestrutura.

Responsabilidade do cliente:  
Você gerencia apenas o código da aplicação e os dados. A Azure cuida do resto (SO, middleware, escalabilidade etc.).

Exemplos na Azure:  

Azure App Service: hospedagem de aplicações web e APIs.

Azure SQL Database: banco de dados SQL como serviço.

Azure Functions: funções serverless que executam código sob demanda.

Azure Kubernetes Service (AKS): orquestração de containers.

Caso de uso:  
Desenvolvimento ágil, apps web e móveis, integração contínua/entrega contínua (CI/CD).

🔹 SaaS (Software as a Service)  
Definição:  
Software totalmente gerenciado que você acessa via internet. Nenhuma preocupação com infraestrutura, plataforma ou manutenção.

Responsabilidade do cliente:  
Apenas usa o software. Tudo é gerenciado pela Microsoft.

Exemplos na Azure (via Microsoft):  

Microsoft 365 (Outlook, Word, Excel online, Teams).

Dynamics 365: CRM e ERP em nuvem.

Power BI: plataforma de análise de dados.

Caso de uso:  
E-mail corporativo, gestão de relacionamento com clientes, análise de dados, produtividade.

🧩 Resumo comparativo:  
| Característica          | IaaS                       | PaaS                      | SaaS                        |
| ----------------------- | -------------------------- | ------------------------- | --------------------------- |
| Nível de controle       | Alto                       | Médio                     | Baixo                       |
| Gerenciado pelo cliente | Infraestrutura de software | Aplicações e dados        | Apenas uso final            |
| Exemplo na Azure        | Azure VM, Storage          | App Service, SQL Database | Microsoft 365, Dynamics 365 |

Os modelos IaaS, PaaS e SaaS são modelos de entrega de serviço, não estão limitados à nuvem pública.  
Em uma nuvem privada, a própria empresa assume o papel de "provedor" interno, oferecendo esses serviços aos seus usuários ou departamentos.

Modelo de Responsabilidade Compartilhada

O modelo de responsabilidade compartilhada define quais partes são responsabilidade do provedor de nuvem (como Azure, AWS, GCP) e quais são do cliente, dependendo do tipo de serviço usado (IaaS, PaaS, SaaS).

Esse modelo é fundamental para segurança, conformidade e operação correta em ambientes de nuvem.

🛡️ Modelo de Responsabilidade Compartilhada – Visão Geral  
| Tipo de Serviço | Provedor é responsável por...                             | Cliente é responsável por...                                  |
| --------------- | --------------------------------------------------------- | ------------------------------------------------------------- |
| **IaaS**        | Infraestrutura física, rede, armazenamento, virtualização | Sistema operacional, aplicações, dados, segurança dos acessos |
| **PaaS**        | Infraestrutura, SO, middleware, runtime, escalabilidade   | Aplicação, lógica de negócio, dados, contas de usuário        |
| **SaaS**        | Tudo (infraestrutura, aplicação, segurança do sistema)    | Dados inseridos, configurações de uso, controle de acesso     |

📊 Comparação Visual Simplificada  
Responsabilidade:  
+----------------------------+------------+------------+------------+  
| Camada / Componente       | IaaS       | PaaS       | SaaS       |  
+----------------------------+------------+------------+------------+  
| Aplicações                | Cliente    | Cliente    | Provedor   |  
| Dados                     | Cliente    | Cliente    | Cliente    |  
| Runtime / Middleware      | Cliente    | Provedor   | Provedor   |  
| Sistema Operacional       | Cliente    | Provedor   | Provedor   |  
| Virtualização             | Provedor   | Provedor   | Provedor   |  
| Servidores físicos        | Provedor   | Provedor   | Provedor   |  
| Armazenamento / Rede      | Provedor   | Provedor   | Provedor   |  
+----------------------------+------------+------------+------------+

Em modelos on premises (no local) todas as responsabilidades ficam para o cliente!

🔐 Exemplo com Microsoft Azure  
| Serviço da Azure           | Modelo | Responsabilidade do Cliente                                         |  
| -------------------------- | ------ | ------------------------------------------------------------------- |  
| **Azure Virtual Machines** | IaaS   | Instalar/atualizar SO, configurar firewall, criptografar dados      |  
| **Azure App Service**      | PaaS   | Subir o código da aplicação, proteger endpoints, gerenciar usuários |  
| **Microsoft 365**          | SaaS   | Gerenciar usuários, senhas, permissões, proteger dados              |

🧠 Por que isso importa?  
**Segurança**: mal-entendidos sobre responsabilidades levam a brechas.  

**Compliance**: saber o que é gerenciado por quem é essencial para normas como LGPD, ISO 27001, etc.  

**Suporte**: quando algo dá errado, saber se o problema é com o provedor ou cliente agiliza a resposta.  

---

## Componentes de Arquitetura do Azure

### Regiões  

🌍 **O que são Regiões no Azure?**  
No Microsoft Azure, uma **região** representa uma área geográfica específica que contém um ou mais datacenters altamente conectados entre si e gerenciados como uma única entidade lógica.  
Essas regiões são fundamentais para garantir **alta disponibilidade**, **redução de latência**, **residência dos dados** e **conformidade regulatória**.

---

📌 **Características das Regiões do Azure**

1. **Maior cobertura global**  
   - A Azure possui mais de 60 regiões distribuídas globalmente, mais do que qualquer outro provedor de nuvem.  
   - Atende a mais de 140 países.  
   - Permite escolher onde hospedar dados e aplicações conforme localização ou requisitos legais.

2. **Datacenters interconectados**  
   - Cada região pode ter múltiplos datacenters, chamados de **availability zones**.  
   - Essas zonas são isoladas fisicamente e garantem **alta tolerância a falhas**.  

3. **Baixa latência e desempenho**  
   - Hospedar serviços perto dos usuários melhora a **resposta** e o **desempenho**.  

4. **Residência e conformidade dos dados**  
   - Manutenção de dados dentro de fronteiras legais.  
   - Importante para leis como:
     - LGPD (Brasil)
     - GDPR (Europa)

5. **Redundância e recuperação de desastres**  
   - Com **geo-replicação**, dados podem ser replicados entre regiões.  
   - Isso permite **planos robustos de DR (Disaster Recovery)**.

---

### Pares de Regiões

🔁 **O que são Pares de Regiões no Azure?**  
Um **par de regiões** é uma relação entre duas regiões dentro da mesma área geopolítica (separadas por no mínimo 300 milhas).  
Definidos pela Microsoft para garantir **resiliência** e **continuidade de serviços**.

📍 Exemplos:
- Brazil South ↔ South Central US  
- East US ↔ West US

---

✅ **Vantagens dos Pares de Regiões**

1. **Recuperação de Desastres (DR)**  
   - Em caso de falha crítica, a outra região do par pode assumir os serviços.  
   - Permite replicação eficiente.

2. **Atualizações planejadas com segurança**  
   - Azure nunca atualiza as duas regiões de um par ao mesmo tempo.  
   - Reduz risco de falha simultânea.

3. **Prioridade na recuperação**  
   - Em caso de falha global, regiões em pares têm **prioridade na restauração**.

4. **Sincronização de dados**  
   - Serviços como **Azure Storage com GRS** usam os pares para replicar dados.

---

🌐 **Exemplo Prático**  
- Sistema hospedado na **East US**.  
- **West US** é o par oficial.  
- Dados são replicados automaticamente.  
- Em falha, é possível ativar serviços no par.  
- Atualizações são feitas em regiões diferentes em momentos distintos.

📌 **Considerações**
- Nem todos os serviços estão disponíveis em todas as regiões.  
- Lista oficial de pares de regiões:  
👉 [Pares de Regiões - Documentação Azure](https://learn.microsoft.com/azure/best-practices-availability-paired-regions)

---

### Regiões Soberanas do Azure

🛡️ **O que são Regiões Soberanas do Azure?**  
As **regiões soberanas** são instâncias separadas da nuvem pública da Azure.  
Projetadas para atender a requisitos específicos de:
- **Conformidade**
- **Segurança**
- **Soberania de dados**

Elas são **isoladas da infraestrutura global** e possuem **controles mais rigorosos**, frequentemente exigidos por:
- Leis nacionais
- Organizações governamentais

🔐 **Principais Características**

### Isolamento Total
- As regiões soberanas são **fisicamente e logicamente separadas** da nuvem pública do Azure.
- **Nenhuma comunicação direta** entre a nuvem pública e as nuvens soberanas.

### Soberania dos Dados
- Os dados **permanecem dentro da jurisdição legal exigida** (como o território nacional).
- Ideal para governos e órgãos que **não podem permitir que seus dados saiam do país**.

### Operadas por Parceiros Locais ou pelo Governo
- Algumas regiões são **geridas por entidades governamentais ou empresas locais**, em parceria com a Microsoft.

### Conformidade Rigorosa
- Atendem a padrões de segurança como:
  - FedRAMP (EUA)
  - DoD IL (níveis de segurança do Departamento de Defesa dos EUA)
  - ITAR (controle internacional de exportação de armamentos)
  - CJIS (para justiça criminal)

---

🌐 **Exemplos de Regiões Soberanas do Azure**

1. **Azure Government (EUA)**
   - Projetado para agências do governo dos EUA.
   - Isolado da nuvem pública.
   - Conformidades: **FedRAMP High, DoD Impact Level 5**.
   - Localizado exclusivamente nos EUA e **operado por funcionários autorizados**.

2. **Azure China**
   - Operado pela **21Vianet**, empresa chinesa.
   - Totalmente separado da Azure global.
   - Atende às **exigências do governo chinês** sobre soberania de dados.

3. **Azure Germany** *(descontinuado como soberano exclusivo)*
   - Era operado pela **T-Systems**, parceiro alemão.
   - Oferecia uma nuvem isolada com foco em leis de proteção de dados.
   - Posteriormente integrado à estrutura de **Regiões da União Europeia**, mantendo conformidade.

---

✅ **Por que uma Região Soberana?**

Essas regiões são ideais quando há necessidade de:

- Conformidade legal e regulatória rígida  
- Soberania de dados  
- Segurança nacional  
- Ambientes altamente sensíveis *(defesa, justiça, inteligência)*

Essas regiões se relacionam com:

- **Azure Governamental**: instância separada e isolada do Azure, acessível apenas para pessoal verificado do governo dos EUA.
- **Azure China**: operado localmente em conformidade com regulamentações do governo chinês.

---

📦 **O que são Grupos de Recursos no Azure?**

Um **Grupo de Recursos** é um **container lógico** que agrupa vários recursos do Azure (VMs, bancos de dados, redes, etc.) com o **mesmo ciclo de vida** (implantação, atualização e exclusão).

---

🎯 **Objetivos dos Grupos de Recursos**

- **Gerenciamento unificado**: aplicar políticas, monitoramento, RBAC e tags de forma centralizada.  
- **Organização lógica**: separar por projeto, cliente, ambiente (prod/teste), etc.  
- **Infraestrutura como código**: usado com templates ARM ou Bicep para automação.

---

🔗 **1. Agrupamento Unificado**  
Todos os recursos de uma aplicação em um único grupo.

✅ Vantagens:
- Gerenciamento e exclusão simplificados  
- Ideal para ambientes pequenos

---

🔄 **2. Agrupamento Separado por Função**  
Distribuição por categorias, como:

- Grupo para web/banco de dados  
- Grupo para VMs  
- Grupo para armazenamento

✅ Vantagens:
- Mais controle e flexibilidade  
- Permissões distintas por equipe  
- Ideal para ambientes complexos

---

🔐 **Considerações sobre uso**
- Os recursos de um grupo devem estar na **mesma região** (exceto os globais).  
- Recursos podem ser **movidos entre grupos** (com limitações).  
- Importante para **RBAC**: controle de acesso detalhado.  
- **NÃO É POSSÍVEL RENOMEAR UM GRUPO DE RECURSOS.**  
- **TODO recurso do Azure deve estar vinculado a um grupo de recursos.**

---

✅ **Por que isso é obrigatório?**

O **Grupo de Recursos** é a **unidade básica de gerenciamento** no Azure. Ele permite:

- 🌐 Localização lógica para os recursos  
- 🔐 Controle de acesso (RBAC) por grupo  
- 📊 Monitoramento e métricas centralizadas  
- ⚙️ Gerenciamento de ciclo de vida completo  
- 🧾 Aplicação de políticas e tags

# 🔧 Recursos do Azure

## 🖥️ Máquinas Virtuais (Virtual Machines)
As VMs do Azure permitem criar e executar sistemas operacionais completos na nuvem. São ideais para:

- Hospedar aplicações legadas  
- Ambientes de desenvolvimento/teste  
- Migração de servidores físicos (lift and shift)  

É possível escolher diferentes tamanhos, regiões e sistemas operacionais, além de configurar escalabilidade sob demanda.

## 🗃️ Contas de Armazenamento (Storage Accounts)
Serviço usado para armazenar blobs (arquivos), filas, tabelas e discos. Suporta:

- Armazenamento de backup e dados não estruturados  
- Alta durabilidade (99.999999999%)  
- Opções de replicação geográfica (GRS, LRS)  

É fundamental para aplicações que exigem persistência de dados na nuvem.

## 🌐 Redes Virtuais (Virtual Networks)
São como "redes privadas" na nuvem. Permitem:

- Conectar recursos do Azure de forma segura  
- Estabelecer VPNs com redes locais (on-premises)  
- Controlar tráfego com Network Security Groups (NSG)  

Elas formam a base da comunicação entre serviços, sendo essenciais para arquiteturas seguras e escaláveis.

## 🌍 Serviços de Aplicativos (App Services)
Serviço PaaS (Platform as a Service) que facilita a hospedagem de aplicações web, APIs REST e backends móveis sem se preocupar com infraestrutura. Oferece:

- Escalabilidade automática  
- Suporte a várias linguagens (.NET, Node.js, Java, Python)  
- Integração contínua com GitHub, Azure DevOps  

## 🛢️ Bancos de Dados SQL (Azure SQL Database)
Banco de dados relacional gerenciado baseado no SQL Server. Fornece:

- Alta disponibilidade integrada  
- Backup automático  
- Escalabilidade e performance sob demanda  

Ideal para aplicações empresariais que necessitam de dados estruturados e transações ACID.

## ⚡ Funções (Azure Functions)
Serviço serverless para executar pequenos trechos de código em resposta a eventos. Vantagens:

- Você paga apenas pelo tempo de execução  
- Integração com eventos de armazenamento, filas, HTTP, etc.  
- Redução significativa da complexidade e custo para tarefas automatizadas  

---

# Assinaturas do Azure

Uma conta pode ter diversas assinaturas (grupos de gerenciamento), mas uma assinatura pode haver apenas uma conta, uma estratégia de refinamento de custos no Azure é criar uma assinatura diferente para cada grupo de trabalho.

- **Conta do Azure**: É a identidade principal (usuário ou empresa) usada para acessar e gerenciar os serviços do Azure. Está associada a um e-mail e a um método de pagamento.  

- **Assinaturas**: São divisões dentro da conta do Azure que separam ambientes ou projetos. Exemplos:  
  - Assinatura de Desenvolvimento  
  - Assinatura de Teste  
  - Assinatura de Produção  
  Cada assinatura possui recursos próprios, políticas e controle de acesso isolado.  

- **Conta de Cobrança**: Agrupa os custos de uma ou mais assinaturas para fins de faturamento.  

- **Perfil de Cobrança**: Subdivisão da conta de cobrança que gera faturas específicas para diferentes áreas ou departamentos.  

- **Seção de Fatura**: Subdivisão do perfil de cobrança que organiza o faturamento de assinaturas específicas dentro da mesma fatura.  

---

# Grupos de Gerenciamento

## 🏢 1. Grupos de Gerenciamento
- Estão no topo da hierarquia.  
- Usados para aplicar políticas e controle de acesso de forma centralizada.  
- Podem agrupar várias assinaturas.  
- As assinaturas herdam as condições aplicadas ao grupo de gerenciamento.  
- Ideal para grandes organizações com múltiplas áreas, departamentos ou projetos.  

## 📄 2. Assinaturas (Subscriptions)
- Ficam dentro dos grupos de gerenciamento.  
- Controlam limites de uso, cobrança e acesso a recursos do Azure.  
- Cada assinatura pode ter vários grupos de recursos.  

## 🗂️ 3. Grupos de Recursos (Resource Groups)
- Contêm os recursos do Azure (como VMs, bancos de dados, etc.).  
- Servem para organizar recursos relacionados que compartilham o mesmo ciclo de vida.  
- Permitem gerenciamento conjunto (por exemplo, exclusão ou aplicação de tags).  

## ⚙️ 4. Recursos (Resources)
São os componentes reais usados na nuvem, como:  
- Máquinas virtuais (VMs)  
- Bancos de dados SQL  
- Armazenamento  
- Serviços de rede  

Esses recursos são criados dentro dos grupos de recursos.

## 📌 Conclusão:
A hierarquia é:  
**Grupos de Gerenciamento → Assinaturas → Grupos de Recursos → Recursos**  

Essa estrutura permite controle eficiente, governança, segurança e organização escalável em ambientes corporativos no Azure.

## Continuação sobre Azure e afins [aqui!](https://github.com/K4rlous/resumo-cloudAzure)
