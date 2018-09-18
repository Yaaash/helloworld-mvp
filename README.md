# helloworld-mvp

This version of the app is called helloworld-mvp. The sample aims to: Provide a basic Model-View-Presenter (MVP) architecture without using any architectural frameworks.

We are gonna follow this nomenclature for this app:
1. All views are called Android Views which refers to android.view.View
2. The view that receives commands from a presenter in MVP, is referred to as "view".

In this app, each screen is implemented using the following classes and interfaces:

- A contract class which defines the connection between the view, the presenter and the model.
- An Activity which creates Android Views, presenters and implements the view interface.
- A presenter which implements the presenter interface in the corresponding contract.
- A model which implemets the model interface in the corresponding contract.
