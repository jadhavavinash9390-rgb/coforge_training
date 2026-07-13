function getEmployeeDetails() {

    var eid = document.getElementById("eid").value;

    alert("Function Called");

    var req = new XMLHttpRequest();

    req.open("GET", "EmployeeController?eid=" + eid, true);

    req.onreadystatechange = function () {

        if (req.readyState == 4 && req.status == 200) {

            alert("Status = " + req.status);

            var result = req.responseText.trim();

            alert("Response = " + result);

            var arr = result.split(" ");

            alert(arr[0]);
            alert(arr[1]);
            alert(arr[2]);

            document.getElementById("ename").value = arr[0];
            document.getElementById("esalary").value = arr[1];
            document.getElementById("dno").value = arr[2];

            alert(document.getElementById("ename").value);
        }
    };

    req.send();
}