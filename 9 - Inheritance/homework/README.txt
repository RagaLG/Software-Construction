Question:
How is this lab an example of reuse through inheritance?
Answer:
This lab has four types of Pokemon - NORMAL, GRASS, WATER, FIRE
The base class Pokeman defines common attributes and behaviors that are shared among all Pokemon, 
such as name, type, attack, and health.
Each specific Pokémon type has its unique characteristics and behaviors implemented in its respective 
subclass while inheriting the common properties from the base class. This modular approach makes it 
easier to manage and extend the codebase.
Inheritance ensures that all Pokemon objects, regardless of their species, have a consistent 
structure with attributes. This consistency simplifies code maintenance and ensures that 
operations common to all Pokemon work uniformly.