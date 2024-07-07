<!DOCTYPE html>
<html>
<head>
    <title>Sorting Algorithms</title>
<body>
<div>
    <h1 class="faded-text">
        <span style="color: #ff0000">S</span><span style="color: #ff2a00">o</span>
        <span style="color: #ff5500">r</span><span style="color: #ff7f00">t</span>
        <span style="color: #ffaa00">i</span><span style="color: #ffd400">n</span>
        <span style="color: #ffff00">g</span><span style="color: #aaff00"> </span>
        <span style="color: #55ff00">A</span><span style="color: #00ff00">l</span>
        <span style="color: #00ff80">g</span><span style="color: #00ffff">o</span>
        <span style="color: #00aaff">r</span><span style="color: #0055ff">i</span>
        <span style="color: #0000ff">t</span><span style="color: #2e00ff">h</span>
        <span style="color: #5d00ff">m</span><span style="color: #8b00ff">s</span>
    </h1>
</div>

<div class="container">
    <form action="sort" method="get">
        <label for="arrayValues">Enter Array Values (comma-separated):</label>
        <input type="text" name="arrayValues" id="arrayValues" placeholder="Ex: 69, 420, 7, 11, 10" required>
        <label for="algorithm">Select Sorting Algorithm:</label>
        <select name="algorithm" id="algorithm">
            <option value="quick">Quick Sort</option>
            <option value="heap">Heap Sort</option>
            <option value="merge">Merge Sort</option>
            <option value="radix">Radix Sort</option>
            <option value="bucket">Bucket Sort</option>
        </select>
        <button type="submit">Sort</button>
    </form>
</div>
</body>
</html>

<style>
    h1 {
        text-align: center;
    }
    .faded-text span {
        text-align: center;
        font-size: larger;
    }
    pre {
        color: rgb(38, 0, 255);
        text-align: center;
    }
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f0f0f0;
    }

    .container {
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    form {
        display: flex;
        flex-direction: column;
    }

    input[type="text"] {
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    select {
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    button {
        padding: 10px;
        margin-top: 20px;
        border: none;
        border-radius: 4px;
        background-color: #4CAF50;
        color: #fff;
        cursor: pointer;
        font-size: 16px;
    }

    button:hover {
        background-color: #45a049;
    }

</style>