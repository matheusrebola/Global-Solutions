import 'package:flutter/material.dart';
import 'package:gean_gs1/model/model_drone.dart';
import 'package:gean_gs1/model/source_drones.dart';

class ListaDrones extends StatelessWidget {

  ListaDrones({super.key});
  final List<ModelDrone> drones = SourceDrones().drones;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Lista de Drones'), backgroundColor: Colors.green),
      body: ListView.builder(
        itemCount: drones.length,
        itemBuilder: (context, index) {
          return Container(
            margin: const EdgeInsets.all(20),
            child: Column(
              children: [
                ListTile(
                  title: Text(drones[index].id, style: const TextStyle(color: Colors.green, fontWeight: FontWeight.bold))
                ),
                ListTile(
                  title: const Text("Plantação"),
                  subtitle: Text(drones[index].plantacao),
                ),
                ListTile(
                  title: const Text("Status"),
                  subtitle: Text(drones[index].status),
                ),
                ListTile(
                  title: const Text("Bateria"),
                  subtitle: Text(drones[index].bateria),
                ),
              ],
            ),
          );
        },
      ),
    );
  }
}