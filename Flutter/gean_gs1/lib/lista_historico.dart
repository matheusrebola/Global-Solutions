import 'package:flutter/material.dart';
import 'package:gean_gs1/model/model_imagem.dart';
import 'package:gean_gs1/model/source_imagens.dart';

class ListaHistorico extends StatelessWidget {
  ListaHistorico({super.key});
  final List<ModelImagem> imagens = SourceImagens().imagens;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Histórico'), backgroundColor: Colors.green),
      body: ListView.builder(
        itemCount: imagens.length,
        itemBuilder: (context, index) {
          return Container(
            margin: const EdgeInsets.all(20),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Container(
                    margin: const EdgeInsets.fromLTRB(12, 12, 0, 0),
                    child: Image.asset(imagens[index].imagem, height: 70)),
                ListTile(
                  title: const Text("ID"),
                  subtitle: Text(imagens[index].id),
                ),
                ListTile(
                  title: const Text("Drone"),
                  subtitle: Text(imagens[index].drone),
                ),
                ListTile(
                  title: const Text("Tipo"),
                  subtitle: Text(imagens[index].tipo),
                ),
                ListTile(
                  title: const Text("Pragas"),
                  subtitle: Text(imagens[index].pragas),
                ),
                ListTile(
                  title: const Text("Melhorias"),
                  subtitle: Text(imagens[index].melhorias),
                ),
              ],
            ),
          );
        },
      ),
    );
  }
}
