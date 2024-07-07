<!DOCTYPE html>
<html>
<head>
    <title>Sorting Result</title>
</head>
<body>
     <div class="container">
    <h1>Sorting Result</h1>
    <div class="result">
        <p><strong>Original Array:</strong> ${arrayValues}</p>
        <p><strong>Sorted Array:</strong> ${sortedArray}</p>
        <p><strong>Algorithm Used:</strong> ${algorithm} sort</p>
        <p><strong>Duration Taken:</strong> ${duration} nanoseconds</p>
    </div>
    <a style="font-size: larger;" href="${pageContext.request.contextPath}/">Back to Sorting</a>
</div>

</body>
</html>

<style>
    .result {
        margin-top: 40px;
        margin-bottom: 20px;
        padding: 30px;
        border: 10px solid #c5c1c1;
        border-radius: 4px;
        background-color: #8ec1e7;
    }
    .container {
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .result p {
        font-size: larger;
    }
    pre {
        text-align: center;
    }
</style>