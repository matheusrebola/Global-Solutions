import 'package:flutter/material.dart';
import 'package:gean_gs1/detalhes_imagem.dart';
import 'package:gean_gs1/model/model_imagem.dart';
import 'package:gean_gs1/model/source_imagens.dart';

class ListaImagens extends StatelessWidget {

  ListaImagens({super.key});
  final List<ModelImagem> imagens = SourceImagens().imagens;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Lista de Imagens'), backgroundColor: Colors.green),
      body: ListView.builder(
        itemCount: imagens.length,
        itemBuilder: (context, index) {
          return Container(
            margin: const EdgeInsets.all(20),
            child: Row(
              children: [
                Image.asset(imagens[index].imagem, width: 100, height: 100),
                Container(
                  margin: const EdgeInsets.only(left: 20),
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Container(
                        margin: const EdgeInsets.only(bottom: 10),
                        child: Text(imagens[index].id)
                      ),
                      ElevatedButton(
                        style: ButtonStyle(backgroundColor: MaterialStateProperty.all(Colors.green)),
                        child: const Text("Ver detalhes"),
                        onPressed: () { Navigator.push(context, MaterialPageRoute(builder: (context) => DetalhesImagem(imagens[index]))); }),
                    ]
                  ),
                )
              ],
            ),
          );
        },
      ),
    );
  }
}