async function showGreetings(button) {
  const responseFromServer = await fetch('/greetings');
  const greetings = await responseFromServer.json();
  const greetingContainer = document.getElementById('greeting-container');
  
  greetingContainer.innerText = greetings.greeting;
}
