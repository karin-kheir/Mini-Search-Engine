# Mini Search Engine

A lightweight console-based search engine built using pure Java.  
The system indexes a collection of text documents and allows efficient keyword-based searching with ranking and highlighting.


## Features

- Load text files from a directory
- Tokenize and clean text (lowercasing, punctuation removal)
- Build an inverted index (word → documents mapping)
- Search using one or more keywords
- Rank results based on relevance
- Display search results
- Modular and extensible architecture


## Project Architecture

The project follows a modular design with clear separation of concerns:

model/ → Data models (Document, SearchResult)
storage/ → File loading and I/O
indexing/ → Tokenization, cleaning, indexing logic
search/ → Search and ranking logic
utils/ → Helper utilities
Main.java → Application entry point


## How It Works

1. The system loads all `.txt` files from a given directory.
2. Each document is tokenized and cleaned.
3. An inverted index is built for fast lookup.
4. The user enters a search query.
5. The engine retrieves relevant documents.
6. Results are ranked and displayed.


## Technologies Used

- Java (Core)
- Collections Framework (Map, List, Set)
- File I/O (NIO)
- Object-Oriented Design
- Modular Architecture


## How to Run

1. Git clone <https://github.com/karin-kheir/Mini-Search-Engine>
2. Add your text files inside the files/ folder.
3. Run :
      javac Main.java
      java Main
4. Enter your search query in the console.


## Future Improvements

- Stemming
- Autocomplete
- Multithreaded indexing
- GUI or REST API interface


## What I Learned

- Designing modular Java applications.
- Implementing inverted indexes.
- Text processing and normalization.
- Ranking algorithms.
- Clean architecture principles.
- Writing maintainable, extensible code.
