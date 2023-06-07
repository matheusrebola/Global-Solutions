import 'model_imagem.dart';

class SourceImagens {

  List<ModelImagem> imagens = List.from(
    [
      ModelImagem("ID164764238647", "img/soja.jpg", "Drone01", "Soja", "Fungos", "Adubar o solo"),
      ModelImagem("ID164764238647", "img/soja2.jpg", "Drone01", "Soja", "Sem pragas", "Irrigar o solo"),
      
      ModelImagem("ID164764238667", "img/milho.jpg", "Drone02", "Milho", "Sem pragas", "Adubar o solo"),
      ModelImagem("ID164764238667", "img/milho2.jpg", "Drone02", "Milho", "Sem pragas", "Nenhuma"),

      ModelImagem("ID164764238682", "img/cafe.jpg", "Drone03", "Café", "Sem pragas", "Realizar a poda"),
      ModelImagem("ID164764238682", "img/cafe2.jpg", "Drone03", "Café", "Ervas Daninhas", "Nenhuma")
    ]
  );

}