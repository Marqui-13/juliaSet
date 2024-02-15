# Julia Set Visualization in Processing

This repository, `juliaSet`, hosts a Processing sketch (`juliaSet.pde`) designed to generate dynamic visualizations of Julia sets, a family of complex fractals named after the French mathematician Gaston Julia. By varying parameters within the sketch, users can explore an infinite variety of Julia set patterns.

## Prerequisites

- [Processing 3](https://processing.org/download/) or newer.

## Setup and Running

1. Install Processing: If you haven't already, download and install Processing from [processing.org](https://processing.org/download/).

2. Clone the Repository: Clone or download this repository to your local machine:

git clone https://github.com/Marqui-13/juliaSet.git

3. Open the Sketch: Launch Processing, navigate to the directory where you cloned the repo, and open `juliaSet.pde`.

4. Run the Sketch: Press the "Play" button or `Ctrl + R` to start the sketch. The visualization will automatically begin, displaying evolving patterns of the Julia set.

## Exploring Different Julia Sets

The sketch calculates Julia set fractals based on complex numbers. By default, the sketch uses a dynamic calculation based on the `cos` and `sin` of an angle that evolves over time. To explore static or different sets, you can uncomment lines 51 and 52 and use the mouse position to change the constants `constantA` and `constantB`, or adjust the constants manually for fixed values.

## Contributing

We welcome contributions to improve the sketch, add new features for exploring Julia sets, or enhance documentation. Please fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Gaston Julia, for his work that led to the discovery of Julia sets.
- The Processing Foundation, for creating a platform that makes programming visual arts and interactive visualizations accessible to everyone.