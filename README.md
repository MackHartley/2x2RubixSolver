<h1 align="center">2x2RubixSolver</h1>
<br>
<p align="center">
 Scramble the cube...
 <br>
 <img src="https://user-images.githubusercontent.com/10659285/114966853-08a09c00-9e39-11eb-8ebf-56898aff3a11.gif" width="500"/>
 <br>
 <br>
 <br>
 ...Enter color values into the algorithm...
 <br>
 <img src="https://user-images.githubusercontent.com/10659285/114966931-2cfc7880-9e39-11eb-8a1d-5978d1aa2d0d.gif" width="500"/>
 <br>
 <br>
 <br>
 ...Run the bidirectional BFS algorithm...
 <br>
 <img src="https://user-images.githubusercontent.com/10659285/114966923-266e0100-9e39-11eb-976f-2a6155c40b21.gif"/>
 <br>
 <br>
 <br>
 ...And it's solved!
 <br>
 <img src="https://user-images.githubusercontent.com/10659285/114966891-15bd8b00-9e39-11eb-8d21-2f9df447b6e3.gif" width="500"/>
</p>

# Why and How I Made This
My mother asked me if I could solve a 2x2 rubik's cube. Normally I don't care much for rubix cubes but she said she hasn't been able to solve it. I *thought* it would be fairly simple to write a breadth-first search algorithm to solve the cube but surprisingly it was more complicated than I expected. With this naivete in mind I set off to solve the rubik's cube, effectively procrastinating development on [my open source library](https://github.com/MackHartley/RoundedProgressBar) which I really should have been working on instead.

I decided to represent the 2x2x2 cube as a 4x4x4 matrix because that way I don’t have to deal with the fact that each of the cubes on the 2x2x2 rubik's cube has 3 different colored stickers. By working with a 4x4x4 cube, each index can be designated it’s own color.

I also only implemented moves for:
 - Rotating the right side up
 - Rotating the top layer to the left
 - Rotating the front clockwise

I realized I only needed these moves to represent any combination of movement because:
 - If I need to rotate the right side down I could just perform 3 right side up movements
 - As a 2x2x2 cube, I can effectively move the left side up by moving the right side down

Without realizing this I would have needed to implement 12 methods for movement which I wasn’t interested in doing.

Even though I only needed to write 3 functions for movement, they were very annoying to write as it was a bunch of tedious index lookups. Looking back, I obviously should have done some matrix math type stuff but hey if we are going to play that game then we all should have invested in Dogecoin in 2015. Hindsight is 20/20 and such.

The most frustrating issue I realized is that the current state of the algorithm doesn’t recognize one solved cube from another solved cube. This means that whenever I run this algorithm I need to find the corner with white, green and purple and situate it properly so I can read in the data to the algorithm. I could probably solve this by making a better data structure or having some better equality checks in my algorithm, but that’s for a future project.

As for the search algorithm, standard breadth first search turned out to be too memory intensive as the search queue got way too large and my little mac book couldn't take it. I then implemented a bidirectional breadth first search which made any cube solvable almost instantly. The speed increase from that surprised me quite a bit. Cubes went from being unsolvable to instantly solvable.

Anyways, I can now say I’ve solved a 2x2 rubik's cube!
