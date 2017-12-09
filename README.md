# Neurette-51
Neurette is a Java application with a goal to increase one's odds of prospering in live online roulette playrooms.

Might I add, the application itself is not anything special, but a very simple one, only providing input for the neural network and reading the ouput of the same. The true value, in mine oppinion, lies in the other files in this git, such as datasets and trained networks.

## What does this do?
This application tries to predict the half of roulette where the next ball will end up, based on last ten draws and under the questionlable assumptions that some live online roulette rooms aren't completely random and that the last x draws influence the following ones.

You simply input last ten drawn numbers and pass it to recieve an output in form of an area.

## Basic information on solution shape and origin
This git containsan Eclipse Java solution minus the depending Files and libraries, which can be obtained online as they are all free to use. All of this is stationed in Source folder, while the other folders contain .txt datasets i procured myself.

## Folders and files
- "Source" folder - main folder containing the application, containing 3 subfolders >>>
   - "META-INF" folder - contains dependencies information >
    
   - "org/eclipse/jdt/internal/jarinjarloader" folder - contains some Eclipse files >>> 
   
   - "neurette" folder - contains application code >>   
     - "neurette.java" file - contains nearly complete code for both application design and funcionality;
     - "nn1.java" file - side file containig only the small portion of code;
     
- "gathered_data" folder - contains series of roulette entries i gathered, grouped in different folders based on the techniques i used for their transformation into information

- "generated_datasets" folder - contains series of datasets i made using the data from the folder above

- "trained_networks" folder - contains most succesfull neural networks of those i made using the above mentioned datasets. They are in .nnet format as I trained using the [Neuroph framework](http://neuroph.sourceforge.net/).

## Contributing and versioning
Currently the code and datasets have only one version (this one) and only one contributor (me).
