import 'model_drone.dart';

class SourceDrones {

  List<ModelDrone> drones = List.from(
    [
      ModelDrone("Drone01", "Soja", "OK", "80%"),
      ModelDrone("Drone02", "Milho", "OK", "66%"),
      ModelDrone("Drone03", "Café", "Necessita reparos", "32%")
    ]
  );

}