# OtakuVerse
Nome do projeto: OtakuVerse
IDE: Android Studio
BD: Firebase

Ideias:
1. Cadastro de usuário, moderador e administrador.
2. Compartilhamento de Conteúdo.
3. Comunicação entre usuários.
4. Poder ter uma lista de anime, mangas, manhua e mawhua (duvida sobre esse)
5. Personalização de Perfil.
6. Descobertas de novos interesses.
7. Segurança
8. Opções de bloqueio e de seguir outro usuário
9. Grupos de discussão.
10. Categorizar o conteúdo compartilhado.

Ideias de layout

Penso em um app nas paletas roxas e pretas, um menu navbar na parte de baixo que direciona a cada parte do app que apareça em todas as telas, quero algo bem moderno com layout bem bonito e funcional.

Arquitetura do aplicativo:

Penso no App assim, tela inicial será a de login onde terá solicitando e-mail ou username e a senha e embaixo a opção de resgistrar que ira guiar a pessoa para outra tela que lá ter pedindo as informações nome, e-mail, username(quero que seja unico 1 por usuario),senha, confirmar senha, biografia, localização e  idade, depois disso se tudo der certo irá ir para a pagina de perfil onde irá aparecer todas as informações tirando o e-mail e a senha, a pessoa podera alterar tudo que está lá se quiser e podera colocar uma foto de perfil da sua preferencia e na parte debaixo ira aparecer para ela nessa mesma tela o menu que irá para as outras partes do app, o chat que lá tera conversas com de 1 para 1 e de grupos no chat terá opção de enviar imagem, video, outra opção no menu será o feed que lá ira terá opção de criar um post que pode conter ou não uma imagem ou video ou pode ser somente texto, a pessoa no feed terá os posts de toda a comunidade se ela clicar no post verá as informações do post como data, autor e tambem as opções de comentar ou dar um gostei e somente para o autor do post pode excluir ele  e os comentarios o autor do post pode excluir qualquer mas o autor do comentario tambem pode excluir o propio comentario acho que é isso

aplicativo em componentes:
Componente de login: responsável por autenticar os usuários.
Componente de registro: responsável por criar novas contas de usuário.
Componente de perfil: responsável por exibir e editar as informações do usuário.
Componente de menu: responsável por fornecer acesso às diferentes partes do aplicativo.
Componente de chat: responsável por permitir que os usuários se comuniquem entre si.
Componente de feed: responsável por exibir os posts da comunidade.

bibliotecas:
Para autenticação: Firebase Authentication
Para armazenamento de dados: Firestore database
Para comunicação: Firebase Cloud Messaging



