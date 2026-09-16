# Exercício de POO em Java

Exercício prático para estudo de Orientação a Objetos em Java.

### Controle de Carro (Encapsulamento)
Sistema de controle de um carro com marchas, aceleração e limites de velocidade.

## Regras de negócio
### Funcionalidades
- Ligar / desligar o carro
- Acelerar / diminuir velocidade
- Virar para a esquerda / direita
- Verificar velocidade atual
- Trocar de marcha

### Regras principais
- O carro só pode ser ligado, ter velocidade e marcha alteradas se estiver **ligado**
- Velocidade varia de 0 a 120 km/h, em incrementos de 1 km/h
- O carro possui 6 marchas, com uma faixa de velocidade específica para cada uma (não é permitido pular marchas)
- Só é possível desligar o carro em ponto morto (marcha 0) e com velocidade 0
- Só é possível virar (esquerda/direita) com velocidade entre 1 km/h e 40 km/h

### Faixas de velocidade por marcha

| Marcha | Velocidade mínima | Velocidade máxima |
|--------|--------------------|---------------------|
| 0 (ponto morto) | — | não pode acelerar |
| 1 | 0 km/h | 20 km/h |
| 2 | 21 km/h | 40 km/h |
| 3 | 41 km/h | 60 km/h |
| 4 | 61 km/h | 80 km/h |
| 5 | 81 km/h | 100 km/h |
| 6 | 101 km/h | 120 km/h |

## 🛠️ Como executar

1. Clone o repositório: `git clone <url-do-repo>`
2. Compile: `javac Main.java`
3. Execute: `java Main`

## 📚 Conceito praticados
- Encapsulamento
- Princípios SOLID (parcial)