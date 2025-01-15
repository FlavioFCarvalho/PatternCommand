O Command Pattern encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com diferentes solicitações, filas ou logs de solicitações, e suporte operações reversíveis. É amplamente usado em sistemas de controle de operações como editores de texto, sistemas de automação, etc.

# Contexto: Sistema de Controle de Dispositivos Inteligentes
Imagine um sistema de automação residencial onde podemos:

Ligar uma luz.
Desligar uma luz.
Ligar um ventilador.
Com o Command Pattern, encapsulamos cada comando (ligar, desligar, etc.) em uma classe separada para que possam ser tratados de forma uniforme.

# Explicação
Command (Interface): Define a interface execute() que todos os comandos precisam implementar.
LightOnCommand, LightOffCommand, FanOnCommand:
Implementam o comando específico para ligar ou desligar os dispositivos.
Light e Fan (Receptores):
As classes reais que possuem os métodos turnOn() e turnOff().
RemoteControl (Invoker):
O controle remoto define e dispara os comandos.
Classe Main:
Configura os comandos e usa o RemoteControl para executar as ações.

# Benefícios do Padrão Command
Desacoplamento: O invoker (RemoteControl) não precisa saber os detalhes da implementação dos comandos.
Reusabilidade: Os comandos podem ser reutilizados em diferentes cenários.
Facilidade de Extensão: Novos comandos podem ser adicionados sem modificar as classes existentes.
