import 'package:flutter/material.dart';
import 'package:gean_gs1/lista_imagens.dart';

import 'lista_drones.dart';
import 'lista_historico.dart';

void main() {
  runApp(const MaterialApp(
    title: 'Global Solution 1 - Gean Lucas Teco Pfefer',
    home: TelaInicial(),
  ));
}

class TelaInicial extends StatelessWidget {
  const TelaInicial({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Início'), backgroundColor: Colors.green),
      body: Center(
        child: Container(
          margin: const EdgeInsets.all(20),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              const Text('Monitoramento de Plantações',
                  style: TextStyle(fontSize: 21, color: Colors.green)),
              Container(
                margin: const EdgeInsets.only(top: 20),
                child: const Text(
                  'A partir da análise das imagens recebidas, a nossa IA generativa indicará quais são ações mais apropriadas a serem executadas, visando aumentar a produtividade da cultura em questão \n\nA partir dos botões abaixo, você pode conferir as Imagens Fotografadas e suas respectivas Análises, os Drones ativos e todo o histórico de Análises.',
                  textAlign: TextAlign.center,
                ),
              ),
              Container(
                margin: const EdgeInsets.only(top: 20),
                child: ElevatedButton(
                    style: ButtonStyle(backgroundColor: MaterialStateProperty.all(Colors.green)),
                    child: const Text('Ver imagens'), onPressed: () { Navigator.push(context, MaterialPageRoute(builder: (context) => ListaImagens())); }),
              ),
              Container(
                margin: const EdgeInsets.only(top: 20),
                child: ElevatedButton(
                    style: ButtonStyle(backgroundColor: MaterialStateProperty.all(Colors.green)),
                    child: const Text('Ver drones ativos'), onPressed: () { Navigator.push(context, MaterialPageRoute(builder: (context) => ListaDrones())); }),
              ),
              Container(
                margin: const EdgeInsets.only(top: 20),
                child: ElevatedButton(
                  style: ButtonStyle(backgroundColor: MaterialStateProperty.all(Colors.green)),
                  child: const Text('Conferir histórico'), onPressed: () { Navigator.push(context, MaterialPageRoute(builder: (context) => ListaHistorico())); }),
              )
            ],
          ),
        ),
      ),
    );
  }
}
