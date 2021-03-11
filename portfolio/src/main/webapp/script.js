async function showGreetings(button) {
  const responseFromServer = await fetch('/greetings');
  const textFromResponse = await responseFromServer.text();
  
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = textFromResponse;
}
