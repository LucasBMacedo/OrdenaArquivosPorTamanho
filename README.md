📁 projeto: Listagem de Arquivos por Tamanho

📝 descricao: >
  Aplicação Java que recebe um caminho de diretório e lista todos os arquivos contidos,
  ordenando-os em ordem crescente de tamanho (em megabytes). O programa valida se o
  caminho informado é um diretório válido antes de realizar a listagem.

🗂️ estrutura_arquivos:

📄 src/controller/recebeCaminho.java: >
  Contém o método responsável por:
    - Validar se o caminho é um diretório existente
    - Obter os arquivos contidos no diretório
    - Ordenar os arquivos pelo tamanho usando o algoritmo Bubble Sort
    - Exibir o nome e tamanho de cada arquivo (em MB)

📄 src/view/Principal.java: >
  Classe principal da aplicação.
    - Define o caminho do diretório a ser analisado
    - Chama o método de listagem da classe de controle
    - Trata exceções caso o diretório seja inválido

🧠 logica_listagem:

metodo: readDir(String path)  
explicacao: >
  Verifica se o caminho existe e é um diretório. Em seguida:
    - Obtém todos os arquivos do diretório
    - Ordena os arquivos com Bubble Sort com base no tamanho em bytes
    - Converte o tamanho de bytes para megabytes
    - Exibe no console os arquivos com nome e tamanho formatado

💬 exemplo_saida_console: |
  Documento1.pdf      Tamanho: 0.83
  imagem.png          Tamanho: 2.45
  projeto.zip         Tamanho: 10.27

📥 entrada:
  descricao: >
    O programa espera um caminho válido de diretório como entrada. O diretório deve conter
    arquivos comuns (não diretórios) para serem listados.

📤 saida:
  descricao: >
    A listagem dos arquivos do diretório, em ordem crescente de tamanho (MB), exibida diretamente no console.
    Não há geração de novos arquivos.

🔗 dataset: 
  nome: Arquivos locais do usuário
  origem: Diretório definido no código (ex: "/Users/lucasbezerrademacedo/Documents")

📌 observacoes:

🛡️ O programa trata erros como:
  - Caminho inexistente
  - Caminho não é um diretório

💻 Compatível com:
  - Windows, macOS e Linux (ajustando o caminho do diretório conforme o sistema)

👨‍💻 autor: 
  nome: Lucas Bezerra de Macedo
