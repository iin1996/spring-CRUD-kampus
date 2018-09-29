$(document).ready( function () {
    var table = $('#mahasiswaTable').DataTable({
        "sAjaxSource": "/mahasiswas",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "nim"},
            { "mData": "namaMahasiswa" },
            { "mData": "alamat" }
        ]
    })
});