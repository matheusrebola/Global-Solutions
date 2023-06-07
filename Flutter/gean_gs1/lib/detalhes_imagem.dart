import 'package:flutter/material.dart';
import 'package:gean_gs1/model/model_imagem.dart';

class DetalhesImagem extends StatelessWidget { 
  final ModelImagem data;
  const DetalhesImagem(this.data, {super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: const Text('Detalhes'), backgroundColor: Colors.green),
        body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Container(
                margin: const EdgeInsets.fromLTRB(12, 12, 0, 0),
                child: Image.asset(data.imagem, height: 200)),
            ListTile(
              title: const Text("ID", textAlign: TextAlign.center),
              subtitle: Text(data.id, textAlign: TextAlign.center),
            ),
            ListTile(
              title: const Text("Drone", textAlign: TextAlign.center),
              subtitle: Text(data.drone, textAlign: TextAlign.center),
            ),
            ListTile(
              title: const Text("Tipo", textAlign: TextAlign.center),
              subtitle: Text(data.tipo, textAlign: TextAlign.center),
            ),
            ListTile(
              title: const Text("Pragas", textAlign: TextAlign.center),
              subtitle: Text(data.pragas, textAlign: TextAlign.center),
            ),
            ListTile(
              title: const Text("Melhorias", textAlign: TextAlign.center),
              subtitle: Text(data.melhorias, textAlign: TextAlign.center),
            ),
          ],
        ));
  }
}