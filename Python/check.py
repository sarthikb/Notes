import dash
import dash_html_components as html
from dash.dependencies import Input, Output, State
import dash_bootstrap_components as dbc

app = dash.Dash(__name__, external_stylesheets=[dbc.themes.BOOTSTRAP])

def read_data_from_file(file_path):
    with open(file_path, 'r') as file:
        return file.read()

data_file_path = 'check.txt'
data_content = read_data_from_file(data_file_path)

app.layout = html.Div([
    html.H1("Data Display Example"),
    html.Button('Click to view data', id='open-popup', className='mb-3', style={'fontSize': 24}),
    html.Div([
        html.Div(data_content, id='popup-content', style={'display': 'none'}),
        html.Div(id='popup-modal', className='modal', children=[
            html.Div(className='modal-content', children=[
                html.Span('Data Content', className='close', id='close-popup'),
                html.Div(id='modal-content')
            ])
        ])
    ])
])

@app.callback(
    Output('modal-content', 'children'),
    Output('popup-modal', 'style'),
    [Input('open-popup', 'n_clicks'),
     Input('close-popup', 'n_clicks')],
    [State('popup-content', 'children')]
)
def update_popup(n_clicks_open, n_clicks_close, data_content):
    if n_clicks_open and not n_clicks_close:
        return data_content, {'display': 'block'}
    return '', {'display': 'none'}

if __name__ == '__main__':
    app.run_server(debug=True)
