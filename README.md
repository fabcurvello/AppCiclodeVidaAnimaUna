# App Ciclo de Vida (Anima UNA)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Aplicativo para visualizar, na prática, a ordem em que o Android chama os métodos do **ciclo de vida de uma Activity**.

## Contexto acadêmico

Exercício aplicado em sala de aula na **UNA**, faculdade do grupo **Ânima Educação**, na disciplina de desenvolvimento mobile. A Ânima Educação é um conglomerado de instituições de ensino superior brasileiras, do qual fazem parte o Centro Universitário IBMR (Rio de Janeiro) e a UNA (Minas Gerais).

## O que o app faz

- Sobrescreve os métodos do ciclo de vida da `MainActivity` (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`).
- A cada método executado, exibe um `Toast` na tela e registra uma mensagem no **Logcat** (`Log.i`).
- Permite ao aluno observar a ordem das chamadas ao abrir, minimizar, girar e fechar o app.

## Conceitos trabalhados em aula

- **Ciclo de vida da Activity**
- Mensagens rápidas com `Toast`
- Depuração com `Log` e Logcat

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 29` / `compileSdk 35`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppCiclodeVidaAnimaUna.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 29 ou superior.

## Veja também

Outros repositórios de aula com o mesmo tema:

- [AppCicloDeVidaAnima](https://github.com/fabcurvello/AppCicloDeVidaAnima)
- [AppMP3PlayerCicloDeVidaAnimaUNA](https://github.com/fabcurvello/AppMP3PlayerCicloDeVidaAnimaUNA)
- [APPMP3PlayerCicloDeVidaAnima](https://github.com/fabcurvello/APPMP3PlayerCicloDeVidaAnima)

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
